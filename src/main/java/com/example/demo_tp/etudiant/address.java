package com.example.demo_tp.etudiant;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class address implements Serializable {
    private String rue;
    private Integer numero;
    private String ville;
}
