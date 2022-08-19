package com.tirage.API.Tirage.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Postulant {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="id_postulant")

    private Long id_postulant;
    private String nom;
    private String prenom;
    private String numero;
    private String mail;
}
