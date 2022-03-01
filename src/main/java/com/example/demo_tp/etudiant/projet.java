package com.example.demo_tp.etudiant;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;


public class projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int duree;
    @OneToMany
    private Set<etudiant> lesEtudiants=new HashSet<>();

}
