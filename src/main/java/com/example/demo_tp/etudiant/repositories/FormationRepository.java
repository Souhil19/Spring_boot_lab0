package com.example.demo_tp.etudiant.repositories;

import com.example.demo_tp.etudiant.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface FormationRepository extends JpaRepository<Formation,Long> {

}
