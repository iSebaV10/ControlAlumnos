package cl.ecamp.desafiocontrolAlumnos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cl.ecamp.desafiocontrolAlumnos.repository.AlumnoRepository;
import cl.ecamp.desafiocontrolAlumnos.repository.DireccionRepository;

@SpringBootApplication
public class DesafioControlAlumnosApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DesafioControlAlumnosApplication.class, args);
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		//AlumnoRepository alumnoRepo = acac.getBean(AlumnoRepository.class);
		DireccionRepository direccionRepo = acac.getBean(DireccionRepository.class);
		System.out.println(direccionRepo.findAll());
	}

}
