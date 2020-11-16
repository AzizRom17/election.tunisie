package tn.isg.projet.aos.election.tunisie.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "User")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;
    @NonNull
    private String login;
    @NonNull
    private String mdp;

}
