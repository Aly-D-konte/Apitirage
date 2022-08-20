package com.tirage.API.Tirage.Service.Implementation;

import com.tirage.API.Tirage.Model.Tirage;
import com.tirage.API.Tirage.Repository.TirageRepository;
import com.tirage.API.Tirage.Service.TirageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TirageServiceImpl  implements TirageService {

    @Autowired
    TirageRepository tirageRepository;


    @Override
    public List<Tirage> lister() {
        return null;
    }

    @Override
    public Iterable<Object[]> tirageAleatoire( Long id) {
        return tirageRepository.tirageAleatoire(id);
    }
}
