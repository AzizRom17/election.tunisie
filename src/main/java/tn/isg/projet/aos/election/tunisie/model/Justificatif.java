package tn.isg.projet.aos.election.tunisie.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name ="Justificatif")
public class Justificatif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_justificatif;
    private String url;
    private byte photo;
    private byte video;
    private String document;
    private Activite activite;

    @ManyToOne
    private Set<Activite> activites=new HashSet<>();
}
