package com.example.demo_tp.etudiant;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address implements Serializable {
    private Integer numero;
    private String ville;
    private String rue;
}
