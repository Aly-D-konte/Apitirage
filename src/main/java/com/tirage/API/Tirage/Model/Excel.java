package com.tirage.API.Tirage.Model;



import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Excel {
    /*
    public List<Postulant> excelImport( MultipartFile file) {
        List <Postulant> postulantList = new ArrayList<>();


        String nom_postulant="";
        String prenom_postulant="";
        String numero_postulant="0";
        String email_postulant="";


       // String excelFilePath = "C:\\Users\\ADIAWIAKOYE\\IdeaProjects\\apiFreeTirage\\CSV.xlsx";
        // String excelFilePath = "C:\\Users\\mkkeita\\Desktop\\projects\\apiFreeTirag\\file1.xlsx";

        Long start = System.currentTimeMillis();//l'heure de debut

        try {
            //FileInputStream inputStrean = new FileInputStream(file.getInputStream());
            Workbook workbook = new XSSFWorkbook(file.getInputStream());

            Sheet firstSheet=workbook.getSheetAt(0);
            Iterator<Row> rowIterator=firstSheet.iterator();

            rowIterator.next();

            while (rowIterator.hasNext()){

                Row nextRow = rowIterator.next();
                Iterator<Cell> cellIterator=nextRow.cellIterator();

                while (cellIterator.hasNext()){
                    Cell nextCell=cellIterator.next();

                    int columnIndex=nextCell.getColumnIndex();
                    switch (columnIndex){
                        case 0:
                            nom_postulant=nextCell.getStringCellValue();
                            System.out.println(nom_postulant);
                            break;
                        case 1:
                            prenom_postulant=nextCell.getStringCellValue();
                            System.out.println(prenom_postulant);
                            break;
                        case 2:
                            numero_postulant=(String) nextCell.getStringCellValue();
                            System.out.println(numero_postulant);
                            break;
                        case 3:
                            email_postulant=nextCell.getStringCellValue();
                            System.out.println(email_postulant);
                            break;
                    }
                    //postulantList.add(new Postulant(nom_postulant, prenom_postulant, numero_postulant, email_postulant));
                }
                postulantList.add(new Postulant(nom_postulant, prenom_postulant, numero_postulant, email_postulant));


            }
            workbook.close();
            Long end = System.currentTimeMillis();//l'heure de fin
            System.out.printf("Import done in %d ms\n", (end - start));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  postulantList;
    }*/
}
