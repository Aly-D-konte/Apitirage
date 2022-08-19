package com.tirage.API.Tirage.Service.Implementation;

import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Repository.ListePostulantRepository;
import com.tirage.API.Tirage.Service.ListePostulantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListePostulantServiceImpl implements ListePostulantService {
    @Autowired
    ListePostulantRepository listePostulantRepository;

    @Override
    public List<ListePostulant> lister() {
        return listePostulantRepository.findAll();
    }

}
