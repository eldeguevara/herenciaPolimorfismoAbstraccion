package org.example.clases;

import org.example.intarface.CalculadorDePrecio;

import java.util.List;

public class CalculadorDePrecioSinDescuento implements CalculadorDePrecio {
    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double precioTotal = 0.0;
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio() * producto.getCantidad();
        }
        return precioTotal;
    }
}
