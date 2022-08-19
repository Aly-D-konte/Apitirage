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

public class ListePostulant {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "idListeP")

    private Long idListeP;
    private Date date;
    private String libelle;

    @ManyToMany
    private Postulant postulant;
}
