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
    private Long id_postulant;
    private String nom_postulant;
    private String prenom_postulant;
    private String numero_postulant;
    private String mail_postulant;
    @ManyToOne
    @JoinColumn(name = "id_liste")
    private ListePostulant listePostulant;


}
