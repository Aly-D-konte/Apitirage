package com.tirage.API.Tirage.Service.Implementation;

import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Model.Postulant;
import com.tirage.API.Tirage.Model.Tirage;
import com.tirage.API.Tirage.Repository.TirageRepository;
import com.tirage.API.Tirage.Service.TirageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class TirageServiceImpl  implements TirageService {

    @Autowired
    TirageRepository tirageRepository;



    @Override
    public List<Postulant> creer(@RequestBody Tirage tirage, List<Postulant> listAtrier, Long nbre) {

        //création d'une variable random
        Random rand = new Random();

        //declaration de la liste qui contiendra les postulants selectionnés
        List<Postulant> list = new ArrayList<>();

        for (int i= 0; i< nbre; i++)
        {
            //Convertire le Random en nombre
            Integer idAct = rand.nextInt(listAtrier.size());
            //Ajouter la liste trié à la liste
            list.add(listAtrier.get(idAct));
            //Supprimer la liste trier à la liste importer
            listAtrier.remove(listAtrier.get(idAct));
        }
        tirageRepository.save(tirage);

//        tirageRepository.INSERERTIRAGE(tirage.getLibelle(), id_Liste_postulant);
        return list;
    }


    @Override
    public List<Tirage> lister() {
        return null;
    }

    @Override
    public Tirage ajouter(Tirage tirage) {
        return tirageRepository.save(tirage);
    }


    @Override
    public Tirage trouverTirageParLibelle(String libelle) {
        return tirageRepository.findByLibelle(libelle);
    }

   /* @Override
    public Iterable<Object[]> tirageAleatoire( Long id) {
        return tirageRepository.tirageAleatoire(id);
    }

    */
}
