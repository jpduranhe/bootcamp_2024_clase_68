package cl.bootcamp.modulo_68.model;

import lombok.Data;

@Data
public class Persona {
	private int id;
	private String rut;
	private String nombre;
	private String apellido;
	private String email;

	
	public Persona (int id){
		this.id=id;
	}
	
	
}
