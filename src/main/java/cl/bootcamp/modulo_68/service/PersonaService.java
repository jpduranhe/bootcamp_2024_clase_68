package cl.bootcamp.modulo_68.service;

import cl.bootcamp.modulo_68.model.Persona;

public interface PersonaService {
	
	boolean crear(Persona persona);
	Persona porRut(String rut);

}
