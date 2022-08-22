package com.tirage.API.Tirage.Controller;

import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Model.Postulant;
import com.tirage.API.Tirage.Model.PostulantTire;
import com.tirage.API.Tirage.Model.Tirage;
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

    @PostMapping("/createTirage/{libelle}/{nbre}")
    public String create(@RequestBody Tirage tirage, @PathVariable String libelle, @PathVariable Long nbre){
        tirage.setDateT(new Date());
        ListePostulant listePostulant = listePostulantService.trouverListeParLibelle(libelle);
        //retourne tous les postulants d'une liste donnée
        Long id_Liste_postulant =  listePostulant.getId_Liste_postulant();//identifiant de la liste entrée par l'user
        List<Postulant> postulantList = postulantService.postulantParListe(listePostulant);
        System.out.println(postulantList);
/*
       for (Object p: postuL)
       {
           System.out.println(p);
       }
*/      //List<Object> pl = ;
        //postulantTrieService.creer(pl.)

        //postulantTrieService.creer(postuL);
        List<Postulant> ListePostulants = tirageService.creer(tirageService.ajouter(tirage), postulantList, nbre, id_Liste_postulant);//recuperation des id des postulant trié
        Long id_Tirage = tirageService.trouverTirageParLibelle(tirage.getLibelle()).getIdTirage();

        for (Postulant p : ListePostulants){
            PostulantTire pos=new PostulantTire(null, tirageService.trouverTirageParLibelle(tirage.getLibelle()));
            postulantTrieService.ajouter(pos);
            //postulantTrieService.creer(p.getId_postulant(),p.getNom_postulant(),p.getPrenom_postulant(), p.getNumero_postulant(),p.getMail_postulant(), id_Tirage);
        }

        return "succès";
    }


}
