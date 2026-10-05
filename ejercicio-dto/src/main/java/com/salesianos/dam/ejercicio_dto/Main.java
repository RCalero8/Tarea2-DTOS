package com.salesianos.dam.ejercicio_dto;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Main {
    @PostConstruct
    public void main(){
        System.out.println("Hola");
    }
}
