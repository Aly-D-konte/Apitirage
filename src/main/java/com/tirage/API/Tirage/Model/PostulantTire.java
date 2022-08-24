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

}
