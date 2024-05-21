package cl.bootcamp.modulo_68.model;

import lombok.Data;

@Data
public class Usuario {
	
	private int id;
	private String username;
	private String password;
	
	private Persona persona;

}
