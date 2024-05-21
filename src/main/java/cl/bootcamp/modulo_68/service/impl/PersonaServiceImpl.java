package cl.bootcamp.modulo_68.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.bootcamp.modulo_68.entity.PersonaEntity;
import cl.bootcamp.modulo_68.model.Persona;
import cl.bootcamp.modulo_68.model.Usuario;
import cl.bootcamp.modulo_68.repository.PersonaRepository;
import cl.bootcamp.modulo_68.service.PersonaService;
import cl.bootcamp.modulo_68.service.UsuarioService;
import lombok.extern.apachecommons.CommonsLog;

@Service
@CommonsLog
public class PersonaServiceImpl implements PersonaService {
	
	private final PersonaRepository personaRepository;
	private final UsuarioService usaurioService;
	
	

	public PersonaServiceImpl(PersonaRepository personaRepository, UsuarioService usaurioService) {
		this.personaRepository = personaRepository;
		this.usaurioService = usaurioService;
	}

	@Override
	@Transactional
	public boolean crear(Persona persona) {
		try {
			
			PersonaEntity personaEntity = new PersonaEntity();
			personaEntity.setRut(persona.getRut());
			personaEntity.setNombre(persona.getNombre());
			personaEntity.setApellido(persona.getApellido());
			personaEntity.setEmail(persona.getEmail());

			
			PersonaEntity personaEntityGuardado=personaRepository.save(personaEntity);
					
			
			Usuario usuario= new Usuario();
			usuario.setUsername(persona.getEmail());
			//usuario.setPassword(persona.getRut().substring(0,5));
			usuario.setPersona(new Persona(personaEntityGuardado.getId()));
			usaurioService.crear(usuario);
			
			return true;
		}catch(Exception ex) {
			log.error(ex.getMessage());
			throw ex;
		}
	}

	@Override
	public Persona porRut(String rut) {
		// TODO Auto-generated method stub
		return null;
	}

}
