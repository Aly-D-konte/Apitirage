package com.tirage.API.Tirage.Service;

import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Model.Tirage;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ListePostulantService {

    ListePostulant creer(ListePostulant listePostulant);

    List<ListePostulant> lister();
    ListePostulant trouverListeParLibelle(String libelle);
    ListePostulant modifier(Long id_liste_postulant);
    int nombreListe();

}
