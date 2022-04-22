package cl.ecamp.desafiocontrolAlumnos.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {

	@Id
	private Integer idAlumno;
	private String rut;
	private String nombre;
	private String apellido;
	private String email;
	private Integer edad;
	private Date fechaIngreso;
	
	@ManyToOne
	@JoinColumn(name = "id_direccion")
	private Direccion direccion;

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", email=" + email + ", edad=" + edad + ", fechaIngreso=" + fechaIngreso + "]";
	}

}
