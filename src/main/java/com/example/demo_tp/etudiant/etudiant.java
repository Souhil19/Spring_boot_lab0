package com.example.demo_tp.etudiant;

import org.apache.tomcat.jni.Address;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;


public class etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 20)
    private String nom;
    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.ORDINAL)
    private Civility genre;

    @OneToOne(mappedBy = "",cascade = CascadeType.ALL, fetch= FetchType.EAGER)
    private String dep;

    private Date DateEmb;

    @Embedded
    @Basic(fetch = FetchType.LAZY)
    private address adresse;

    @OneToOne(mappedBy = "")
    private projet project;





}

