package it.softwareInside.AnagraficaAppLezione23.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.AnagraficaAppLezione23.models.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, String>{

}
