package com.fst.backend_etat_civil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fst.backend_etat_civil.model.Adresse;

@RepositoryRestResource
@CrossOrigin("*")
public interface AdresseRepository extends JpaRepository<Adresse, Long> {

}
