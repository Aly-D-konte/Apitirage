package com.tirage.API.Tirage.Repository;

import com.tirage.API.Tirage.Model.ListePostulant;
import com.tirage.API.Tirage.Model.Tirage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface TirageRepository extends JpaRepository <Tirage, Long> {

/*    @Query(value = "SELECT * FROM postulant ORDER BY RAND() LIMIT :id", nativeQuery = true)
    Iterable<Object[]> tirageAleatoire(Long id);*/



    Tirage findByLibelle(String libelle);

    //requete permettant d'inser un tirage avec son id
    /*@Modifying
    @Transactional
    @Query(value = "INSERT INTO Tirage(date, libelle, id_liste_postulant) VALUES(NOW(),?,?);",nativeQuery = true)
    public int INSERERTIRAGE(String libelle, Long id_Liste_postulant);*/

}
