package com.tirage.API.Tirage.Service.Implementation;

import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Model.Postulant;
import com.tirage.API.Tirage.Repository.PostulantRepository;
import com.tirage.API.Tirage.Service.PostulantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Service
public class PostulantServiceImpl implements PostulantService {


    @Autowired
    PostulantRepository postulantRepository;

    @PostMapping("/ajouter")
    @Override
    public Postulant Ajout(Postulant postulant) {
        return postulantRepository.save(postulant);
    }



    @Override
    public List<Postulant> lister() {
        return postulantRepository.findAll();
    }

    @Override
    public List<Postulant> Trouverid_Liste_postulant(Long id_Liste_postulant) {
        return postulantRepository.FINDIDPOSTLIST(id_Liste_postulant);
    }

    @Override
    public List<Postulant> enregistrer(List<Postulant> postulantList) {
        return postulantRepository.saveAll(postulantList);
    }

    @Override
    public List<Postulant> postulantParListe(ListePostulant postulant) {
        return postulantRepository.findByListePostulant(postulant);
    }
}
