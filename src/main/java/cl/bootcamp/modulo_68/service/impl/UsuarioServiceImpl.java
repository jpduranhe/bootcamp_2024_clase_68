package cl.bootcamp.modulo_68.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.bootcamp.modulo_68.entity.PersonaEntity;
import cl.bootcamp.modulo_68.entity.UsuarioEntity;
import cl.bootcamp.modulo_68.model.Usuario;
import cl.bootcamp.modulo_68.repository.UsuarioRepository;
import cl.bootcamp.modulo_68.service.UsuarioService;
import lombok.extern.apachecommons.CommonsLog;

@Service
@CommonsLog
public class UsuarioServiceImpl implements UsuarioService {

	private final UsuarioRepository usuarioRepository;
	
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		this.usuarioRepository= usuarioRepository;
	}
	
	
	@Override
	@Transactional
	public int crear(Usuario usuario) {
		try {
			
			PersonaEntity personaEntity= new PersonaEntity();
			personaEntity.setId(usuario.getPersona().getId());
			
			UsuarioEntity usuarioEntity= new UsuarioEntity();
			usuarioEntity.setPassword(usuario.getPassword());
			usuarioEntity.setUsername(usuario.getUsername());
			usuarioEntity.setPersona(personaEntity);
			
			UsuarioEntity usuarioGuardado=usuarioRepository.save(usuarioEntity);
			
			return usuarioGuardado.getId();
			
		}catch(Exception ex) {
			log.error(ex.getMessage());
			throw ex; 
		}
	}

	@Override
	public int editar(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

}
