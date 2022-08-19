package com.tirage.API.Tirage.Controller;

import com.tirage.API.Tirage.Model.Postulant;
import com.tirage.API.Tirage.Service.PostulantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/postulant")
@AllArgsConstructor
public class PostulantController {

    @Autowired
    PostulantService postulantService;

    @PostMapping("/add")
    public Postulant Ajouter(Postulant postulant){
        return this.postulantService.Ajout(postulant);
    }
    @GetMapping("/liste")
    public List<Postulant> lister(){
        return postulantService.lister();
    }


}
