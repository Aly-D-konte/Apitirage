package com.tirage.API.Tirage.Repository;

import com.tirage.API.Tirage.Model.ListePostulant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListePostulantRepository extends JpaRepository <ListePostulant, Long> {
}
