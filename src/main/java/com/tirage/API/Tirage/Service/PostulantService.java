package com.tirage.API.Tirage.Service;

import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Model.Postulant;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PostulantService {


    Postulant Ajout(Postulant postulant);

    List<Postulant> lister();

    List<Postulant> enregistrer(List<Postulant> postulantList);



    //Methodes pour le tirage

    List<Postulant> Trouverid_Liste_postulant(Long id_Liste_postulant);

    List<Postulant> postulantParListe(ListePostulant postulant);
}
