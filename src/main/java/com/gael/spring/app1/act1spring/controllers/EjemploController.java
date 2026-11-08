package com.gael.spring.app1.act1spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class EjemploController {

    @GetMapping("/detalles_info")
    
    public String info(Model model) {
        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Servidor", "GaelMC");
        model.addAttribute("Puerto", "8080");
        return "detalles_info";

    
    }

}
