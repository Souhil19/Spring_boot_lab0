package com.example.demo_tp.etudiant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Departement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20, nullable = false)
    private String nom;
    @ToString.Exclude
    @OneToMany(mappedBy = "deparetment",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Collection<Etudiant> etudiants;

}
