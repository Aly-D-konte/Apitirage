package com.tirage.API.Tirage.Service;

import com.tirage.API.Tirage.Model.PostulantTire;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PostulantTireService {

    List<PostulantTire> lister();
    PostulantTire Modifier(PostulantTire postulantTire, Long id);
}
