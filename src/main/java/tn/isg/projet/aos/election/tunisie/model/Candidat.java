package tn.isg.projet.aos.election.tunisie.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity(name = "Candidat")
public class Candidat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_candidat;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @NonNull
    private Date date_naiss;
    private byte photo;
    private String facebook;
    private String Twitter;

    @OneToMany(mappedBy = "sonActivite",cascade= CascadeType.ALL)
    private Set<Activite> activites = new HashSet<>();
}
