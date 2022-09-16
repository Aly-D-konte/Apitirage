package com.tirage.API.Tirage.Service.Implementation;

import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Model.Tirage;
import com.tirage.API.Tirage.Repository.ListePostulantRepository;
import com.tirage.API.Tirage.Repository.TirageRepository;
import com.tirage.API.Tirage.Service.ListePostulantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListePostulantServiceImpl implements ListePostulantService {
    @Autowired
    ListePostulantRepository listePostulantRepository;

    @Autowired
    TirageRepository tirageRepository;

    @Override
    public ListePostulant creer(ListePostulant listePostulant) {
        return listePostulantRepository.save(listePostulant);
    }

    @Override
    public List<ListePostulant> lister() {
        return listePostulantRepository.findAll();
    }

    @Override
    public ListePostulant trouverListeParLibelle(String libelle) {
        return listePostulantRepository.findByLibelle(libelle);
    }

    @Override
    public ListePostulant modifier(Long id_liste_postulant) {
        return listePostulantRepository.findById(id_liste_postulant).map(
                md->{
                    md.setNombre(listePostulantRepository.findById(id_liste_postulant).get().getNombre()+1);
                    return  listePostulantRepository.save(md);
                }
        ).orElseThrow(()-> new RuntimeException("la liste de postulant non trouvé"));
    }

    @Override
    public int nombreListe() {
        return listePostulantRepository.nombreListe();
    }


}
