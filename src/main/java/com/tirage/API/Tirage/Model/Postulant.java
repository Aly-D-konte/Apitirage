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
    @JoinColumn(name = "id_Liste_postulant")
    private ListePostulant listePostulant;


    public Postulant(String nom_postulant, String prenom_postulant, String numero_postulant, String mail_postulant) {
        this.nom_postulant = nom_postulant;
        this.prenom_postulant = prenom_postulant;
        this.numero_postulant = numero_postulant;
        this.mail_postulant = mail_postulant;
    }



}
