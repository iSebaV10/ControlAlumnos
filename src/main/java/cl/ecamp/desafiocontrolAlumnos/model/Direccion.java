package cl.ecamp.desafiocontrolAlumnos.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {
	
	@Id
	private Integer idDireccion;
	private String calle;
	private String numero;
	private String ciudad;
	private TipoDireccion tipo;
	
	@OneToMany(mappedBy= "direccion", fetch = FetchType.EAGER)
	private List<Alumno> alumno;

	@Override
	public String toString() {
		return "Direccion [idDireccion=" + idDireccion + ", calle=" + calle + ", numero=" + numero + ", ciudad="
				+ ciudad + ", tipo=" + tipo + ", alumno=" + alumno + "]";
	}
	
}
