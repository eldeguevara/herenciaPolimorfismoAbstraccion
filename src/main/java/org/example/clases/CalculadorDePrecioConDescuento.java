package org.example.clases;

import org.example.intarface.CalculadorDePrecio;

import java.util.List;

public class CalculadorDePrecioConDescuento implements CalculadorDePrecio {
    private double descuento;

    public CalculadorDePrecioConDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecioTotal(List<Producto> productos) {
        double precioTotal = 0.0;
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio() * producto.getCantidad();
        }
        return precioTotal * (1 - descuento);
    }
}
