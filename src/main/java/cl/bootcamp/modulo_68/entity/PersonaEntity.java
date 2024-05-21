package cl.bootcamp.modulo_68.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="persona")
@Data
public class PersonaEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="persona_id")
	private int id;
	
	private String rut;
	private String nombre;
	private String apellido;
	private String email;
	
	
}
