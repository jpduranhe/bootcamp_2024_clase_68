package cl.bootcamp.modulo_68;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cl.bootcamp.modulo_68.entity.PersonaEntity;
import cl.bootcamp.modulo_68.model.Persona;
import cl.bootcamp.modulo_68.repository.PersonaRepository;
import cl.bootcamp.modulo_68.service.PersonaService;

@SpringBootTest
public class TestTransaccionalidad {
	
	@Autowired
	PersonaService personaservice;
	
	@Autowired
	PersonaRepository personaRepository;
	
	
	@Test
	void probandoTransaccionalidad() {		
		
		Persona persona= new Persona(0);
		persona.setRut("17654987-9");
		persona.setNombre("Maximo");
		persona.setApellido("Perez");
		persona.setEmail("mperez@mail.com");
		
		//personaservice.crear(persona);
		
		
		PersonaEntity mario=personaRepository.findByApellido("Rojas");
		
		//List<PersonaEntity> ruts=personaRepository.findAllByRutContaining("%5%");
		
		System.out.println(mario);
		
	}

}
