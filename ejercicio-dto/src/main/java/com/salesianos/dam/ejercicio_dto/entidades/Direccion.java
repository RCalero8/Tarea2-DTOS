package com.salesianos.dam.ejercicio_dto.entidades;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {
    private Long id;
    private String tipoVia;
    private String linea1;
    private String linea2;
    private String cp;
    private String poblacion;
    private String provincia;
}
