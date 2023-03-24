package it.softwareInside.AnagraficaAppLezione23.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.AnagraficaAppLezione23.models.Persona;
import it.softwareInside.AnagraficaAppLezione23.repository.PersonaRepository;
import jakarta.validation.Valid;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository personaRepository;
	
	
	public boolean addPersona(@Valid Persona persona) {
		
		try {
			personaRepository.save(persona);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean removePersonaById(@Valid String codiceFiscale) {
		
		try {
			Persona persona = personaRepository.findById(codiceFiscale).get();
			personaRepository.delete(persona);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean updatePersona(@Valid Persona persona) {
		return addPersona(persona);
	}
	
	public Iterable<Persona> listAll() {
		try {
			return personaRepository.findAll();
		} catch (Exception e) {
			return null;
		}
	}
	
	public ArrayList<Persona> listAllAboveSpecificAge() {
		ArrayList<Persona> lista = new ArrayList<>();
		
		for (Persona persona : personaRepository.findAll()) {
			if(persona.getEta() >= 25)
				lista.add(persona);
		}
		
		return lista;
	}

}
