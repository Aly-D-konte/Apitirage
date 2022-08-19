package com.tirage.API.Tirage.Service;

import com.tirage.API.Tirage.Model.PostulantTire;

import java.util.List;

public interface PostulantTireService {

    List<PostulantTire> lister();
    PostulantTire Modifier(PostulantTire postulantTire, Long id);
}
