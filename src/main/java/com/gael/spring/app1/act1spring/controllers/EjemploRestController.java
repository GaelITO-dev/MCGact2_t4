package com.gael.spring.app1.act1spring.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gael.spring.app1.act1spring.models.Empleados;
import com.gael.spring.app1.act1spring.models.dto.ClaseDTO;

import org.springframework.web.bind.annotation.RequestParam;



@RestController 
@RequestMapping ("/api")

public class EjemploRestController {

    @GetMapping(path = "/detalles_info2")

    public ClaseDTO detalles_info2 () {
        /*Empleados empleado1= new Empleados("Juan", "Rodriguez","Calle 1 No 2","Gerente",35, 1234567890, 001);

        //Map<String, Object> respuesta= new HashMap<>();
        respuesta.put("Empleado", "Datos empleado");
        respuesta.put("Informacion", empleado1);*/

        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Gael Martinez");
        
        return usuario1;

    
    }

}
