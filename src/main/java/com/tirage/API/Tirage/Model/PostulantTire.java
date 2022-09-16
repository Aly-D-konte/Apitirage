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
@Table(name = "posttrie")
public class PostulantTire {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_postulant_tire;
    private String nom_postulant;
    private String prenom_postulant;
    private String numero_postulant;
    private String mail_postulant;
    @ManyToOne
    @JoinColumn(name = "id_tirage")
    private Tirage tirage;


    public PostulantTire(Long id_postulant_tire, String nom_postulant, String prenom_postulant, String numero_postulant, String mail_postulant, Tirage tirage) {
        super();
        this.id_postulant_tire = id_postulant_tire;
        this.nom_postulant = nom_postulant;
        this.prenom_postulant = prenom_postulant;
        this.numero_postulant = numero_postulant;
        this.mail_postulant = mail_postulant;
        this.tirage = tirage;
    }
}
