package com.tirage.API.Tirage.Controller;

import com.tirage.API.Tirage.Model.Tirage;
import com.tirage.API.Tirage.Service.TirageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tirage")
@AllArgsConstructor
public class TirageController {
    @Autowired
    TirageService  tirageService;

    @PostMapping("/tirage1")
    Iterable<Object[]> tirageAleatoire(Long id){
        return tirageService.tirageAleatoire(id);

    }

}
