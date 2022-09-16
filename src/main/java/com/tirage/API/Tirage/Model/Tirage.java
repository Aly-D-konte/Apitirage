package com.tirage.API.Tirage.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Tirage {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idTirage;
    private Date dateT = new Date();
    private String libelle;
    private Long nbre_postulant_tire;

    @ManyToOne
    @JoinColumn(name = "id_liste")
    private ListePostulant listePostulant;


}
