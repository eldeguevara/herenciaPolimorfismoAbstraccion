package org.example.clases;

import org.example.intarface.CalculadorDePrecio;

import java.util.List;

public class CalculadorDePrecioPorCategoria implements CalculadorDePrecio {

    private String categoria;

    public CalculadorDePrecioPorCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double precioTotal = 0.0;
        for (Producto producto : productos) {
            if (producto instanceof ProductoElectrónico && categoria.equals("Electrónica")) {
                precioTotal += producto.getPrecio() * producto.getCantidad();
            } else if (producto instanceof ProductoAlimenticio && categoria.equals("Alimenticio")) {
                precioTotal += producto.getPrecio() * producto.getCantidad();
            }
        }
        return precioTotal;
    }

}
