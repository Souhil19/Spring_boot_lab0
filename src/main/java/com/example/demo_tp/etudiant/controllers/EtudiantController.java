package com.example.demo_tp.etudiant.controllers;

import com.example.demo_tp.etudiant.Etudiant;
import com.example.demo_tp.etudiant.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EtudiantController {

    private EtudiantRepository etudiantRepository;
    @Autowired
    EtudiantController(EtudiantRepository etudiantRepository){
        this.etudiantRepository=etudiantRepository;
    }
    public List<Etudiant> getEtudiants(){
        return etudiantRepository.getEtudiants();
    }
}
