package com.example.demo_tp;

import com.example.demo_tp.etudiant.Etudiant;
import com.example.demo_tp.etudiant.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoTpApplication implements CommandLineRunner {

    EtudiantRepository etudiantRepository;
    @Autowired
    public DemoTpApplication(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoTpApplication.class, args);
    }
    @Override
    public void run(String... args){

//        etudiantRepository.save(new Etudiant(null,
//                "aymen",
//                "s.omm@esi.dz",
//                "isi",
//                null
//        ));

        etudiantRepository.findEtudiantByNom("aymen");

        etudiantRepository.findAll().forEach(System.out::println);
    }
}
