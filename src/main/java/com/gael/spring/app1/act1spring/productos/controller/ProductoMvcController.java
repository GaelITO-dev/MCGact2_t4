package com.gael.spring.app1.act1spring.productos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

import com.gael.spring.app1.act1spring.productos.dto.ProductoDTO;
import com.gael.spring.app1.act1spring.productos.service.ProductoService;

@Controller
public class ProductoMvcController {

    private final ProductoService productoService;

    @Value("${productos.nombre}")
    private String nombreProyecto;

    public ProductoMvcController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/productos")
    public String listar(@RequestParam(required = false) String categoria, Model model) {
        model.addAttribute("productos", productoService.listar(categoria));
        model.addAttribute("categoria", categoria);
        model.addAttribute("nombreProyecto", nombreProyecto);
        return "productos/lista";
    }

    @GetMapping("/productos/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new ProductoDTO());
        model.addAttribute("nombreProyecto", nombreProyecto);
        return "productos/formulario";
    }

    @PostMapping("/productos/guardar")
    public String guardar(@ModelAttribute("producto") ProductoDTO producto, Model model) {
        ProductoDTO productoGuardado = productoService.guardar(producto);
        model.addAttribute("producto", productoGuardado);
        model.addAttribute("nombreProyecto", nombreProyecto);
        return "productos/confirmacion";
    }

    @GetMapping("/productos/{id}")
    public String verDetalle(@PathVariable Long id, Model model) {
        ProductoDTO producto = productoService.buscarPorId(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Producto no encontrado"));

        model.addAttribute("producto", producto);
        model.addAttribute("nombreProyecto", nombreProyecto);
        return "productos/detalle";
    }
}
