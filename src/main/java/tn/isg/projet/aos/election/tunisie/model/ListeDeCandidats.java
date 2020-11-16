package tn.isg.projet.aos.election.tunisie.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class ListeDeCandidats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_liste;
    @NonNull
    private String nom;
    private String type;
    @NonNull
    private String gouvernorat;
    private int score;

    @OneToMany(mappedBy = "sa_liste", cascade =CascadeType.ALL)
    private Set<Candidat> membres=new HashSet<>();

    @ManyToMany()
    private Set<Parti> partis=new HashSet<>();
}
