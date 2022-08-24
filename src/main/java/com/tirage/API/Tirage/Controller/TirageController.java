package com.tirage.API.Tirage.Controller;

import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Model.Postulant;
import com.tirage.API.Tirage.Model.PostulantTire;
import com.tirage.API.Tirage.Model.Tirage;
import com.tirage.API.Tirage.Service.Implementation.PostulantTireServiceImpl;
import com.tirage.API.Tirage.Service.ListePostulantService;
import com.tirage.API.Tirage.Service.PostulantService;
import com.tirage.API.Tirage.Service.PostulantTireService;
import com.tirage.API.Tirage.Service.TirageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/tirage")
@AllArgsConstructor
public class TirageController {

/*
    @PostMapping("/tirage1")
    Iterable<Object[]> tirageAleatoire(Long id){
        return tirageService.tirageAleatoire(id);

    }*/


    @Autowired
    private final TirageService tirageService;
    private final ListePostulantService listePostulantService;
    private final PostulantService postulantService;
    private  final PostulantTireService postulantTrieService;
    private  final PostulantTireServiceImpl postulantTrieServiceImpl;

    @PostMapping("/createTirage/{libelle}/{nbre}")
    public String create(@RequestBody Tirage tirage, @PathVariable String libelle, @PathVariable Long nbre){

        if(tirageService.trouverTirageParLibelle(tirage.getLibelle()) == null){ //verifie si le tirage est fait
            ListePostulant listePostulant = listePostulantService.trouverListeParLibelle(libelle);
            List<Postulant> postulantList = postulantService.Trouverid_Liste_postulant(listePostulant.getId_Liste_postulant());

            List<Postulant> ListePostulants = tirageService.creer(tirage, postulantList, nbre);//recuperation des id des postulant trié
            Long id_Tirage = tirageService.trouverTirageParLibelle(tirage.getLibelle()).getIdTirage();
        //tirage.setDateT(new Date());
        //retourne tous les postulants d'une liste donnée
        //Long id_Liste_postulant =listePostulant.getId_Liste_postulant();//identifiant de la liste entrée par l'user
        //List<Postulant> postulantList = postulantService.postulantParListe(listePostulant);



        //Parcouris et enregistré les postulants triés
        for (Postulant p : ListePostulants){
            //PostulantTire pos=new PostulantTire(null, tirageService.trouverTirageParLibelle(tirage.getLibelle()));
            //postulantTrieService.ajouter(pos);
            //Enregistré la liste triée
            postulantTrieService.creer(p.getId_postulant(),p.getNom_postulant(),p.getPrenom_postulant(), p.getNumero_postulant(),p.getMail_postulant(), id_Tirage);
        }



        return "Tirage effectué avec succès" ;
    }else{
        return " Ce tirage exixte dejà";
    }


    }
}
