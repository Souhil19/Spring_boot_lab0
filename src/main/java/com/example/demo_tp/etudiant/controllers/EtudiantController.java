package com.example.demo_tp.etudiant.controllers;

import com.example.demo_tp.etudiant.Etudiant;
import com.example.demo_tp.etudiant.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("etudiant-api")
public class EtudiantController {

    @Autowired
    EtudiantRepository etudiantRepository;

    EtudiantController(EtudiantRepository etudiantRepository){
        this.etudiantRepository=etudiantRepository;
    }
}
