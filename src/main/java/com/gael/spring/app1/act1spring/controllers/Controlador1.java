package com.gael.spring.app1.act1spring.controllers;

import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;





@RestController
public class Controlador1 {

    @GetMapping("/perfil")
    public Map<String, Object>  Contralodor1() {
        Map<String, Object> perfil= new HashMap<>();
        perfil.put("Nombre", "Gael");
        perfil.put("Apellido", "Martinez Cruz");
        perfil.put("Numero de control", 23161006);

        return perfil;
    }
    @GetMapping("/proyecto")
    public String obtenernombreProyecto() {
        String nombreProyecto = "1. Act1. Introducción a Spring Boot - Configuración y Primeros Controladores";
        return nombreProyecto;
    }
    
    @GetMapping("/materias")
    public List<String> obtenerMaterias() {
        return Arrays.asList(
        "Programación Web", 
        "Inteligencia Artificial", 
        "Redes de Computadoras", 
        "Sistemas Operativos");
    }
    
}
