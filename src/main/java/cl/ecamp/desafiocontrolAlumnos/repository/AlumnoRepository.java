package cl.ecamp.desafiocontrolAlumnos.repository;

import org.springframework.data.repository.CrudRepository;

import cl.ecamp.desafiocontrolAlumnos.model.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Integer>{

}
