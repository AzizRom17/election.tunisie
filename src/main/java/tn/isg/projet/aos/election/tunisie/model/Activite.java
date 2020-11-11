package tn.isg.projet.aos.election.tunisie.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Activité")
public class Activite {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_activite;
    private String duree;
    private String type;
    private String support;

    @ManyToOne
    @JoinColumn(name = "id_candidat" )
    private Candidat sonActivite;}
