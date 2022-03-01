package com.example.demo_tp.etudiant.repositories;

import com.example.demo_tp.etudiant.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet,Long> {
}
