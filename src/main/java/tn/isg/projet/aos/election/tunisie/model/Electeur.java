package tn.isg.projet.aos.election.tunisie.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "Electeur")
public class Electeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_electeur;
    @NonNull
    private String nom_e;
    @NonNull
    private String prenom_e;
    @NonNull
    private Date date_naiss_e;
    private byte photo;
    @NonNull
    private String cin_e;

}
