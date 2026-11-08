package com.gael.spring.app1.act1spring.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    
    public Map<String, Object> deatalles_info2 () {
        Map<String, Object> respuesta= new HashMap<>();
        respuesta.put("Titulo", "Servidor en linea");
        respuesta.put("Servidor", "GaelMC");
        respuesta.put("Puerto", "8080");
        return respuesta;

    
    }

}
