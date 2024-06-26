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
@Table(name="usuario")
@Data
public class UsuarioEntity  {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="usuario_id")
	private int id;
	
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	
	@OneToOne
	@JoinColumn( name="persona_id")
	private PersonaEntity persona;
}

