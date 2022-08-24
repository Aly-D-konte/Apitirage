package com.tirage.API.Tirage.Repository;

import com.tirage.API.Tirage.Model.ListePostulant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ListePostulantRepository extends JpaRepository <ListePostulant, Long> {


    ListePostulant findByLibelle(String libelle);
/*
    @Modifying
    @Transactional
    @Query(value = "insert into postulant(id_Liste_postulant) VALUES (:id_Liste_postulant);", nativeQuery = true)
    public int INSERTIDLIST(@Param("id_Liste_postulant") Long id_Liste_postulant);*/

}
