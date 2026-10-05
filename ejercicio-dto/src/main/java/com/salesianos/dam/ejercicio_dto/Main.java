package com.salesianos.dam.ejercicio_dto;

import com.salesianos.dam.ejercicio_dto.dto.ProductoDTO;
import com.salesianos.dam.ejercicio_dto.dto.ProductoDTOConvert;
import com.salesianos.dam.ejercicio_dto.entidades.Categoria;
import com.salesianos.dam.ejercicio_dto.entidades.Producto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Main {
    @PostConstruct
    public void main(){
        Categoria cat = new Categoria(1L, "Informática");
        Producto producto = new Producto(1L, "Portátil", "Portátil de 15 pulgadas",
                799.99, List.of("portatil1.jpg", "portatil2.jpg"), cat);

        ProductoDTO productoDTO = new ProductoDTOConvert().to(producto);
        System.out.println(productoDTO);

    }
}
