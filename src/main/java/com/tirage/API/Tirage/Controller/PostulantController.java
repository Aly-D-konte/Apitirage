package com.tirage.API.Tirage.Controller;

import com.tirage.API.Tirage.Model.Excel;
import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Model.Postulant;
import com.tirage.API.Tirage.Service.ListePostulantService;
import com.tirage.API.Tirage.Service.PostulantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/postulant")
@AllArgsConstructor
public class PostulantController {

    @Autowired
    PostulantService postulantService;
    ListePostulantService listePostulantService;

    @PostMapping("/add")
    public Postulant Ajouter(Postulant postulant){
        return this.postulantService.Ajout(postulant);
    }
    @GetMapping("/liste")
    public List<Postulant> lister(){
        return postulantService.lister();
    }





    @RequestMapping("/import/excel/{libelle}")
    @ResponseBody
    public String importFormExcel(@Param("file") MultipartFile file, ListePostulant listePostulant, String libelle) {
        //listeService.ajouterIdListe();
        Excel excelImporter  = new Excel();
        List<Postulant> postulantList = excelImporter.excelImport(file);
        if(postulantList.size()==0){
            return "Fichier vide";
        }else{
            listePostulant.setDate_liste(new Date());
            ListePostulant l = listePostulantService.creer(listePostulant);
            //long id_liste = listeService.trouverListeParLibelle(libelle).getId_liste();

            for (Postulant p:postulantList){
                p.setListePostulant(l);
            }
            postulantService.enregistrer(postulantList);
            return "import succsfully";
        }
    }




}
