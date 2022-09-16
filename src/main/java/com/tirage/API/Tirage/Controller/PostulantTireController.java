package com.tirage.API.Tirage.Controller;

import com.tirage.API.Tirage.Model.PostulantTire;
import com.tirage.API.Tirage.Service.PostulantTireService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/postulanttire")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class PostulantTireController {
    @Autowired
    PostulantTireService postulantTireService;
/*
    @GetMapping(value = "/afficherpostulanttire")
    public int create(Long id_postulant, String nom_postulant, String prenom_postulant, String numero_postulant, String mail_postulant, Long id_tirage){
        return postulantTireService.creer(id_postulant,nom_postulant,prenom_postulant,numero_postulant,mail_postulant,id_tirage);

    }

 */
    @GetMapping(value = "/afficherpostulanttire")
    public List<PostulantTire> getPostulantTire(){

        return  postulantTireService.AfficherTousLesPostulantTire();
    }


    @GetMapping("/total")
    public List<PostulantTire> list(){

        return  postulantTireService.lister();
    }


}
