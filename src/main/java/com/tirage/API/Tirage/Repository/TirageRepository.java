package com.tirage.API.Tirage.Repository;

import com.tirage.API.Tirage.Model.Tirage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TirageRepository extends JpaRepository <Tirage, Long> {

}
