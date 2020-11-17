package tn.isg.projet.aos.election.tunisie.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "Candidat")
public class Candidat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_candidat;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @NonNull
    private Date date_naiss;
    private String parti;
    private int score;
    @Lob
    private byte photo;
    private String facebook;
    private String Twitter;

    @OneToMany(mappedBy = "candidat")
    Set<Reclamation> ses_reclamations=new HashSet<>();

    @ManyToOne
    @JoinColumn(name="id_liste")
    private ListeDeCandidats sa_liste;

    @OneToMany(mappedBy = "candidat_a")
    private Set<Avis> avis=new HashSet<>();

    @OneToOne
    @JoinColumn(name = "id_cv")
    private Cv cv;


}
