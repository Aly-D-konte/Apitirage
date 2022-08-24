package com.tirage.API.Tirage.Controller;

import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Model.Postulant;
import com.tirage.API.Tirage.Service.ListePostulantService;
import com.tirage.API.Tirage.Service.PostulantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
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





    @PostMapping("/importer/{libelle}")
    public String LireFichier(@Param("file")MultipartFile file, ListePostulant liste, String libelle){

        if(listePostulantService.trouverListeParLibelle(liste.getLibelle())==null){
            ArrayList<Postulant> importer = postulantService.importerFichier(file);
            liste.setDate_liste(new Date());
            ListePostulant l = listePostulantService.creer(liste);

            for (Postulant p: importer)
            {
                p.setListePostulant(l);
                postulantService.Ajout(p);
            }
            postulantService.importerFichier(file);
            postulantService.AfficherTousLesPostulant();
            return "Fichier importé avec succès";
        }else {
            return "Cette liste existe déja.";
        }


    }
    @GetMapping(value = "/afficherpostulant")

    public Iterable<Object[]> getPostulants(){
        return  postulantService.AfficherTousLesPostulant();
    }


}
