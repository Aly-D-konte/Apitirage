package com.tirage.API.Tirage.Repository;

import com.tirage.API.Tirage.Model.PostulantTire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PostulantTireRepository extends JpaRepository <PostulantTire, Long> {

    @Modifying
    @Transactional
    @Query(value="INSERT INTO postulanttire(id,nom,prenom,numero,email,id_tirage)VALUES(?,?,?,?,?,?);",nativeQuery = true)
    public int INSERTPOSTTIRE(Long id_postulant,String nom_postulant,String prenom_postulant,String numero_postulant,String mail_postulant, Long id_tirage);



}
