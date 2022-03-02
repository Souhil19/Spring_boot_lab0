package com.example.demo_tp.etudiant;

import com.example.demo_tp.etudiant.repositories.EtudiantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class EtudiantConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(EtudiantRepository repository) {
        Etudiant anis= new Etudiant(null,
                "aymen",
                "s.omm@esi.dz",
                Civility.Mr,
                "isi",
                Date.from(Instant.now()),
                null,
                null

        );
        Address adr1 =new Address(
                22,
                "sba",
                "rue 13 oct"

        );
        List<Address> adresses1 = new ArrayList<>();
        adresses1.add(adr1);

        Projet projet1=new Projet(
                null,
                "ecommerce",
                33,
                null
        );


        return args -> {
            repository.saveAll(
                    List.of(anis)
            );
        };
    }
}
