package tn.isg.projet.aos.election.tunisie.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "<Reclamation>")
public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rec;
    @NonNull
    private String type_rec;
    @NonNull
    private String justif_rec;
    @NonNull
    private Date date_rec;

    @ManyToOne
    @JoinColumn(name = "id_elec" )
    private Electeur rec_elec;

}
