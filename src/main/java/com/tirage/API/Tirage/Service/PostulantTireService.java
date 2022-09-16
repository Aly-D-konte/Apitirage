package com.tirage.API.Tirage.Service;

import com.tirage.API.Tirage.Model.PostulantTire;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PostulantTireService {


    List<PostulantTire> lister();
    PostulantTire Modifier(PostulantTire postulantTire, Long id);

    //PostulantTire creer(Long id_postulant, String nom_postulant, String prenom_postulant, String numero_postulant, String mail_postulant, Long id_tirage);

    PostulantTire ajouter(PostulantTire postulantTire);

    int  creer(Long id_postulant, String nom_postulant, String prenom_postulant, String numero_postulant, String mail_postulant, Long id_tirage);
    List<PostulantTire> AfficherTousLesPostulantTire();

}
