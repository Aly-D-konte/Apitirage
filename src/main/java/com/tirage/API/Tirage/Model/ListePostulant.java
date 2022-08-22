package com.tirage.API.Tirage.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ListePostulant {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id_Liste_postulant;
    private Date date_liste;
    private String libelle;


}
