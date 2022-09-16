package com.tirage.API.Tirage.Repository;

import com.tirage.API.Tirage.Model.ListePostulant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ListePostulantRepository extends JpaRepository <ListePostulant, Long> {

    @Query(value = "SELECT COUNT(*) FROM liste_postulant WHERE liste_postulant.nombre!=0;", nativeQuery = true)
    int nombreListe();

    ListePostulant findByLibelle(String libelle);
/*
    @Modifying
    @Transactional
    @Query(value = "insert into postulant(id_Liste_postulant) VALUES (:id_Liste_postulant);", nativeQuery = true)
    public int INSERTIDLIST(@Param("id_Liste_postulant") Long id_Liste_postulant);*/


}
