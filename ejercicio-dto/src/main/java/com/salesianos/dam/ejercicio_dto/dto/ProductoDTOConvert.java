package com.salesianos.dam.ejercicio_dto.dto;

import com.salesianos.dam.ejercicio_dto.entidades.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoDTOConvert {
    public static ProductoDTO to(Producto producto){
        String imagen = producto.getImagenes().isEmpty() ? null : producto.getImagenes().get(0);
        return new ProductoDTO(
                producto.getNombre(),
                producto.getPvp(),
                imagen,
                producto.getCategoria().getNombre()
        );
    }
}
