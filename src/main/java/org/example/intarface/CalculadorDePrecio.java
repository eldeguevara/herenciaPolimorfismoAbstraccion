package org.example.intarface;

import org.example.clases.Producto;

import java.util.List;

public interface CalculadorDePrecio {

    double calcularPrecioTotal(List<Producto> productos);

}
