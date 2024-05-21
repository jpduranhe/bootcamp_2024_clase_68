package cl.bootcamp.modulo_68.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.bootcamp.modulo_68.entity.PersonaEntity;

@Repository
public interface PersonaRepository  extends CrudRepository<PersonaEntity,Integer> {

	
	PersonaEntity findByRut(String rut);
	PersonaEntity findByApellido(String apellido);
	List<PersonaEntity> findAllByRutContaining(String rut);
}
