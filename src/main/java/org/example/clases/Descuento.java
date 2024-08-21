package org.example.clases;

import org.example.intarface.CalculadorDePrecio;

import java.util.List;

public class Descuento {
    private CalculadorDePrecio calculadorDePrecio;

    public Descuento(CalculadorDePrecio calculadorDePrecio) {
        this.calculadorDePrecio = calculadorDePrecio;
    }

    public double aplicarDescuento(List<Producto> productos) {
        return calculadorDePrecio.calcularPrecioTotal(productos);
    }

    public void setCalculadorDePrecio(CalculadorDePrecio calculadorDePrecio) {
        this.calculadorDePrecio = calculadorDePrecio;
    }
}
