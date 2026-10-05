package com.salesianos.dam.ejercicio_dto.dto;

import com.salesianos.dam.ejercicio_dto.entidades.Alumno;
import com.salesianos.dam.ejercicio_dto.entidades.Direccion;

public record AlumnoDTO(
        String nombre,
        String apellido,
        String email,
        String curso,
        String direccion
) {
    public static AlumnoDTO to(Alumno alumno){
        return new AlumnoDTO(
                alumno.getNombre(),
                alumno.getApellido1() + " " + alumno.getApellido2(),
                alumno.getEmail(),
                alumno.getCurso().getNombre(),
                formatDireccion(alumno.getDireccion())
        );
    }
    private  static String formatDireccion(Direccion d) {
        return d.getTipoVia()+" "+d.getLinea1()+","+d.getCp()+" "+d.getPoblacion()+"("+d.getProvincia()+")";
    }
}
