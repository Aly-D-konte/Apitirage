package com.tirage.API.Tirage.Controller;

import com.tirage.API.Tirage.Service.PostulantTireService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postulanttire")
@AllArgsConstructor
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
    public Iterable<Object[]> getPostulantTire(){
        return  postulantTireService.AfficherTousLesPostulantTire();
    }


}
