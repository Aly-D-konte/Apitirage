package com.tirage.API.Tirage.Service.Implementation;


import com.tirage.API.Tirage.Model.PostulantTire;
import com.tirage.API.Tirage.Repository.PostulantTireRepository;
import com.tirage.API.Tirage.Service.PostulantTireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostulantTireServiceImpl implements PostulantTireService {
    @Autowired
    PostulantTireRepository postulantTireRepository;



    @Override
    public List<PostulantTire> lister() {
        return postulantTireRepository.findAll();
    }

    @Override
    public PostulantTire Modifier(PostulantTire postulantTire, Long id) {
        return null;
    }

    @Override
    public PostulantTire ajouter(PostulantTire postulantTire) {
        return postulantTireRepository.save(postulantTire);
    }

    @Override
    public int creer(Long id_postulant, String nom_postulant, String prenom_postulant, String numero_postulant, String mail, Long id_tirage_id) {
        return postulantTireRepository.INSERTPOSTTIRE(id_postulant, nom_postulant, prenom_postulant, numero_postulant, mail, id_tirage_id);

    }

    @Override
    public Iterable<Object[]> AfficherTousLesPostulantTire() {
        return postulantTireRepository.AfficherTousLesPostulantTire();
    }

/*
    @Override
    public PostulantTire creer(Long id_postulant, String nom_postulant, String prenom_postulant, String numero_postulant, String mail_postulant, Long id_tirage) {
        return postulantTireRepository.;    }


 */

}
