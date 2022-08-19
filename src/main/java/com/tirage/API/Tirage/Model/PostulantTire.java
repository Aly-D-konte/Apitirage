package com.tirage.API.Tirage.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PostulantTire {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="id_postulant_tire")
    private Long id_postulant_tire;

    @ManyToOne
    private Tirage tirage;

}
