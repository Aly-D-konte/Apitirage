package com.tirage.API.Tirage.Service.Implementation;

import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Model.Postulant;
import com.tirage.API.Tirage.Repository.PostulantRepository;
import com.tirage.API.Tirage.Service.PostulantService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Service
public class PostulantServiceImpl implements PostulantService {


    @Autowired
    PostulantRepository postulantRepository;

    @PostMapping("/ajouter")
    @Override
    public Postulant Ajout(Postulant postulant) {
        return postulantRepository.save(postulant);
    }



    @Override
    public List<Postulant> lister() {
        return postulantRepository.findAll();
    }

    @Override
    public List<Postulant> Trouverid_Liste_postulant(Long id_liste_postulant) {
        return postulantRepository.FINDIDPOSTLIST(id_liste_postulant);
    }

    @Override
    public List<Postulant> enregistrer(List<Postulant> postulantList) {
        return postulantRepository.saveAll(postulantList);
    }

    @Override
    public Iterable<Object[]> AfficherTousLesPostulant() {
        return postulantRepository.AfficherTousLesPostulant();
    }

    @Override
    public ArrayList<Postulant> importerFichier(MultipartFile file) {

        DataFormatter formatter=new DataFormatter();
        ArrayList<Postulant> values = new ArrayList<>(); // Variable permettant de prendre toutes les donnees du tableau

        // Bloque permettant de lever les exceptions lors de l'importation du fichier excel
        try{
            //InputStream fichier = new FileInputStream("fichierSource.xls"); // Recuperation du fichier Execl sous forme de fichier simple

            POIFSFileSystem fs = new POIFSFileSystem(file.getInputStream()); // conversion du fichier simple sous forme d'un fichier POI

            HSSFWorkbook wb = new HSSFWorkbook(fs); // Conversion du fichier POI sous format Workbook

            HSSFSheet sheet = wb.getSheetAt(0); // Recuperation du Premier page du fichier excel

            Iterator rows = sheet.rowIterator(); // Recuperation de tous les lignes de la page du fichier
            // Boucle permettant de parcours toutes lignes de la page

            while (rows.hasNext()){

                //values.clear(); // Vider toutes les donnes du tableau dynamique "values"

                HSSFRow row = (HSSFRow) rows.next(); // Recuperation d'une ligne du tableau

                Iterator cells = row.cellIterator(); // Recuperation de toutes les colonnes de chaque ligne
                Postulant p=new Postulant();
                int numColun=0;
                // Boucle permettant de parcourir toutes les colonnes de chaque ligne
                while (cells.hasNext()){

                    HSSFCell cell = (HSSFCell) cells.next(); // Recuperation d'une colonne

                    switch (numColun){

                        case 0:
                            p.setMail_postulant(formatter.formatCellValue(cell));
                            break;
                        case 1:
                            p.setNom_postulant(formatter.formatCellValue(cell));
                            break;
                        case 2:
                            p.setNumero_postulant(formatter.formatCellValue(cell));
                            break;
                        case 3:
                            p.setPrenom_postulant(formatter.formatCellValue(cell));
                            break;
                        default:
                            break;
                    }
                    numColun++;

                    // Condition permettant de verifier le type de la colonne et effectuer une convesion si c'est type int
                    // if (cell.getCellType() == CellType.NUMERIC){
                    //   values.add(Integer.toString((int) cell.getNumericCellValue()));
                    // }
                    //else{
                    //  values.add(cell.getStringCellValue());
                    // }
                }

                //postulantRepository.INSERTPOSTULANT (values.get(3),values.get(1),values.get(2),values.get(0));
                values.add(p);
            }
            return values;

        }catch (Exception e){

            e.printStackTrace();
            return null;

        }

    }

    @Override
    public List<Postulant> postulantParListe(ListePostulant postulant) {
        return postulantRepository.findByListePostulant(postulant);
    }
}
