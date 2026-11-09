package com.gael.spring.app1.act1spring.productos.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.gael.spring.app1.act1spring.productos.dto.ProductoDTO;

@Service
public class ProductoService {

    private final List<ProductoDTO> productos = new CopyOnWriteArrayList<>();
    private final AtomicLong siguienteId = new AtomicLong(4);

    public ProductoService() {
        productos.add(new ProductoDTO(1L, "Teclado", new BigDecimal("499.00"), "Accesorios"));
        productos.add(new ProductoDTO(2L, "Monitor", new BigDecimal("2499.00"), "Pantallas"));
        productos.add(new ProductoDTO(3L, "Mouse", new BigDecimal("299.00"), "Accesorios"));
    }

    public List<ProductoDTO> listar(String categoria) {
        if (categoria == null || categoria.isBlank()) {
            return new ArrayList<>(productos);
        }

        return productos.stream()
                .filter(producto -> producto.getCategoria() != null
                        && producto.getCategoria().equalsIgnoreCase(categoria.trim()))
                .toList();
    }

    public Optional<ProductoDTO> buscarPorId(Long id) {
        return productos.stream()
                .filter(producto -> producto.getId().equals(id))
                .findFirst();
    }

    public ProductoDTO guardar(ProductoDTO producto) {
        producto.setId(siguienteId.getAndIncrement());
        productos.add(producto);
        return producto;
    }
}
