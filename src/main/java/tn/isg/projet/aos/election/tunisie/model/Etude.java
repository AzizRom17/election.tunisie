package tn.isg.projet.aos.election.tunisie.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "etude")
public class Etude {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_etude;
    @ManyToOne
    private Set<Cv> cvs=new HashSet<>();


}
