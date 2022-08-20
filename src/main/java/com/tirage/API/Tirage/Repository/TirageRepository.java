package com.tirage.API.Tirage.Repository;

import com.tirage.API.Tirage.Model.Tirage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TirageRepository extends JpaRepository <Tirage, Long> {

    @Query(value = "SELECT * FROM postulant ORDER BY RAND() LIMIT :id", nativeQuery = true)
    Iterable<Object[]> tirageAleatoire(Long id);

}
