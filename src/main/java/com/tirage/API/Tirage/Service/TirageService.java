package com.tirage.API.Tirage.Service;

import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Model.Postulant;
import com.tirage.API.Tirage.Model.Tirage;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TirageService {

    List<Tirage> lister();

    Tirage ajouter(Tirage tirage);

 //   Iterable<Object[]> tirageAleatoire(Long id);


    //Methodes pour le tirage
    List<Postulant> creer(Tirage tirage, List<Postulant> listAtrier, Long nbre, Long id_Liste_postulant);

    Tirage trouverTirageParLibelle(String libelle);
}
