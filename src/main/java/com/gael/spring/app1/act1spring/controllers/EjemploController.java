package com.gael.spring.app1.act1spring.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.gael.spring.app1.act1spring.models.Empleados;


@Controller 
public class EjemploController {

    @GetMapping("/detalles_info")
    
    public String info(Model model) {
         Empleados empleado1= new Empleados("Juan", "Rodriguez","Calle 1 No 1","Gerente",35, 1234567890, 001);
         model.addAttribute("Titulo", "Informacion de Empleado");
         model.addAttribute("empleado", empleado1);
        return "detalles_info";

    
    }
    @ModelAttribute("Empleados")
    public List<Empleados> listaEmpleados(){
        return  Arrays.asList(
            new Empleados("Maria", "Perez",
             "Calle segunda no.2", "Secretaria", 
             20, 123654987, 02),
            new Empleados("Pedro", "Gomez",
             "Calle tercera no.3", "Contador",30, 987654321, 03),
            new Empleados("Ana", "Lopez",
             "Calle cuarta no.4", "Asistente", 25, 456789123, 04),
            new Empleados("Luis", "Martinez",
             "Calle quinta no.5", "Analista", 28, 321654987, 05),
            new Empleados("Sofia", "Ramirez",
             "Calle sexta no.6", "Diseñadora", 22, 654987321, 06),
            new Empleados("Diego", "Torres",
             "Calle septima no.7", "Programador", 27, 789123456, 07)   
        );
    }

}
