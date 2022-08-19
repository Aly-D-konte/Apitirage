package com.tirage.API.Tirage.Repository;

import com.tirage.API.Tirage.Model.PostulantTire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostulantTireRepository extends JpaRepository <PostulantTire, Long> {

}
