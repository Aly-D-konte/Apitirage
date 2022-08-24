package com.tirage.API.Tirage.Controller;

import com.tirage.API.Tirage.Model.Postulant;
import com.tirage.API.Tirage.Repository.ListePostulantRepository;
import com.tirage.API.Tirage.Service.PostulantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listepostulant")
@AllArgsConstructor
public class ListePostulantController {

    @Autowired
    ListePostulantRepository listePostulantRepository;

    PostulantService postulantService;
    @PostMapping("/add/{libelle}")
   public List<Postulant> liste(){
        return postulantService.lister();
    }
}
