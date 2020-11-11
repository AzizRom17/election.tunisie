package tn.isg.projet.aos.election.tunisie.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "Electeur")
public class Electeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_elec;
    @NonNull
    private String nom_elec;
    @NonNull
    private String prenom_elec;
    @NonNull
    private Date date_naiss_elec;
    private byte photo_elec;
    @NonNull
    private String cin_elec;

    @OneToMany(mappedBy = "rec_elec",cascade= CascadeType.ALL)
    private Set<Reclamation> reclamations = new HashSet<>();



}
