package tn.isg.projet.aos.election.tunisie.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class Parti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_parti;
    @NonNull
    private String nom;

    @OneToMany(mappedBy = "son_parti", cascade = CascadeType.ALL)
   private Set<ListeElectorale> listes=new HashSet<>();

}
