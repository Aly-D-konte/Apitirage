package com.tirage.API.Tirage.Repository;

import com.tirage.API.Tirage.Model.Tirage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TirageRepository extends JpaRepository <Tirage, Long> {

}
