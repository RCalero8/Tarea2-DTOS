package com.salesianos.dam.ejercicio_dto.entidades;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private Long id;
    private String nombre;
    private String desc;
    private double pvp;
    private List<String> imagenes;
    private Categoria categoria;
}
