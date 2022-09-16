package com.tirage.API.Tirage.Controller;

import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Model.Postulant;
import com.tirage.API.Tirage.Model.Tirage;
import com.tirage.API.Tirage.Repository.ListePostulantRepository;
import com.tirage.API.Tirage.Service.ListePostulantService;
import com.tirage.API.Tirage.Service.PostulantService;
import com.tirage.API.Tirage.Service.TirageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/listepostulant")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class ListePostulantController {

    @Autowired
    ListePostulantRepository listePostulantRepository;

    @Autowired
    ListePostulantService listePostulantService;
    @Autowired
    PostulantService postulantService;

    @Autowired
    TirageService tirageService;
    @PostMapping("/add/{libelle}")
   public List<Postulant> liste(){
        return postulantService.lister();
    }

    @GetMapping("/liste")
     List<ListePostulant> list(){
        return listePostulantService.lister();
}

@GetMapping("/nombre/{libelle}")
    public String nombre(@PathVariable String libelle){
        return tirageService.nombre(libelle);
}

    @GetMapping("/nbre")
    public  int nombre(){
        return listePostulantService.nombreListe();
}
}
