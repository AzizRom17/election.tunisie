package tn.isg.projet.aos.election.tunisie.model;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name="Cv")
public class Cv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cv;
    private Activite activite;
    private Etude etude;

    @OneToMany(mappedBy = "ses_activites", cascade = CascadeType.ALL)
    private Set<Activite> activites = new HashSet<>();
    @OneToMany(mappedBy = "ses_etudes", cascade = CascadeType.ALL)
    private Set<Etude> etudes = new HashSet<>();
}