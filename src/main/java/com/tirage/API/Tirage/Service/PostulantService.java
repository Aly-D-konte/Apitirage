package com.tirage.API.Tirage.Service;

import com.tirage.API.Tirage.Model.Postulant;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PostulantService {


    Postulant Ajout(Postulant postulant);

    List<Postulant> lister();

}
