package com.example.demo_tp;

import com.example.demo_tp.etudiant.Etudiant;
import com.example.demo_tp.etudiant.repositories.EtudiantRepository;
import com.example.demo_tp.etudiant.repositories.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoTpApplication implements CommandLineRunner {

    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    FormationRepository formationRepository;


    public static void main(String[] args) {
        SpringApplication.run(DemoTpApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception{

//        etudiantRepository.save(new Etudiant(null,
//                "aymen",
//                "s.omm@esi.dz",
//                "isi",
//                null
//        ));


        //etudiantRepository.findAll().forEach(System.out::println);
    }
}
