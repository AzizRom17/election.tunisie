package tn.isg.projet.aos.election.tunisie.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Reclamation")
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rec;
    @NonNull
    private String Sujet;
    @NonNull
    private String justif_rec;


    @ManyToOne
    @JoinColumn(name = "id_candidat")
    private Candidat candidat;


}
