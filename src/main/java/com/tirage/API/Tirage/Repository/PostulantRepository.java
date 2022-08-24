package com.tirage.API.Tirage.Repository;

import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Model.Postulant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostulantRepository extends JpaRepository <Postulant, Long>{


//SQL pour tirage
    @Query(value = "SELECT * FROM postulant WHERE id_liste = :id_Liste_postulant", nativeQuery = true)
    public List<Postulant> FINDIDPOSTLIST(@Param("id_Liste_postulant") Long id_Liste_postulant);

    List<Postulant> findByListePostulant(ListePostulant listePostulant);
    @Query(value = "SELECT * FROM postulant", nativeQuery = true)
    Iterable<Object[]> AfficherTousLesPostulant();


}
