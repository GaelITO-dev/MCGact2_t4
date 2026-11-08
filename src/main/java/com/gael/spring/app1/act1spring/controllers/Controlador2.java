package com.gael.spring.app1.act1spring.controllers;

import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;


@RestController 

public class Controlador2 {

    @GetMapping("/objeto")
    public Map<String, Object> obtenerEstatusServidor() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("activo", true);
        respuesta.put("codigo_servidor", 0000);
        respuesta.put("version", 1.0);
        
        return respuesta;
    }
    

}
