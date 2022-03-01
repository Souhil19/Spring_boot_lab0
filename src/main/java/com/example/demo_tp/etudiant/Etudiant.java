package com.example.demo_tp.etudiant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.bytebuddy.asm.Advice;
import org.apache.tomcat.jni.Address;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 20)
    private String nom;
    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private Civility genre;

    @OneToOne(cascade = CascadeType.ALL, fetch= FetchType.EAGER)
    private String departement;

    private Date DateEmb;

    @Embedded
    @Basic(fetch = FetchType.LAZY)
    private Address address;

    @OneToMany(fetch = FetchType.LAZY)
    private Projet projet;

}

