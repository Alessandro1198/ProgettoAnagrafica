package it.softwareInside.AnagraficaAppLezione23.restController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.AnagraficaAppLezione23.models.Persona;
import it.softwareInside.AnagraficaAppLezione23.services.PersonaService;

@RestController
public class PersonaRestController {
	
	@Autowired
	PersonaService personaService;
	
	
	@PostMapping("/add")
	public boolean addPersona(@RequestBody Persona persona) {
		return personaService.addPersona(persona);
	}
	
	@DeleteMapping("/delete")
	public boolean removePersona(@RequestParam("codice") String id) {
		return personaService.removePersonaById(id);
	}
	
	@PostMapping("/update")
	public boolean updatePersona(@RequestBody Persona persona) {
		return personaService.addPersona(persona);
	}
	
	@GetMapping("ListAll")
	public Iterable<Persona> listAll() {
		return personaService.listAll();
	}
	
	@GetMapping("ListAllAboveSpecificAge")
	public ArrayList<Persona> listAllPersonaAboveSpecificAge() {
		return personaService.listAllAboveSpecificAge();
	}

}
