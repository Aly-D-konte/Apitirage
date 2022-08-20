package com.tirage.API.Tirage.Service;

import com.tirage.API.Tirage.Model.Tirage;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TirageService {

    List<Tirage> lister();

    Iterable<Object[]> tirageAleatoire(Long id);
}
