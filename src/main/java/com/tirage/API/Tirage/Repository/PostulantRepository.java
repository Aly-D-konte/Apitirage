package com.tirage.API.Tirage.Repository;

import com.tirage.API.Tirage.Model.Postulant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostulantRepository extends JpaRepository <Postulant, Long>{



}
