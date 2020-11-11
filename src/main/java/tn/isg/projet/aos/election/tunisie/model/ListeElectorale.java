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
public class ListeElectorale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_liste;
    @NonNull
    private String nom_partie;
    @NonNull
    private String gouvernorat;

    @OneToMany(mappedBy = "Sa_Liste", cascade =CascadeType.ALL)
    private Set<Candidat> membres=new HashSet<>();

    @ManyToOne()
    @JoinColumn(name = "id_parti")
    private Parti son_parti;
}
