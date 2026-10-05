package com.salesianos.dam.ejercicio_dto;

import com.salesianos.dam.ejercicio_dto.dto.AlumnoDTO;
import com.salesianos.dam.ejercicio_dto.dto.AlumnoDTOConverter;
import com.salesianos.dam.ejercicio_dto.entidades.Alumno;
import com.salesianos.dam.ejercicio_dto.entidades.Curso;
import com.salesianos.dam.ejercicio_dto.entidades.Direccion;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Main {
    @PostConstruct
    public void main(){
        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNombre("2º DAM");
        curso.setTipo("Ciclo Superior");
        curso.setTutor("Ana Pérez");
        curso.setAula("Aula 12");

        Direccion dir = new Direccion();
        dir.setId(1L);
        dir.setTipoVia("Calle");
        dir.setLinea1("Real 25");
        dir.setLinea2("3ºB");
        dir.setCp("41001");
        dir.setPoblacion("Sevilla");
        dir.setProvincia("Sevilla");

        Alumno alumno = new Alumno();
        alumno.setId(1L);
        alumno.setNombre("Lucía");
        alumno.setApellido1("García");
        alumno.setApellido2("López");
        alumno.setTelefono("600123456");
        alumno.setEmail("lucia@mail.com");
        alumno.setDireccion(dir);
        alumno.setCurso(curso);

        AlumnoDTO dto = AlumnoDTOConverter.to(alumno);

        System.out.println(dto);    }
}
