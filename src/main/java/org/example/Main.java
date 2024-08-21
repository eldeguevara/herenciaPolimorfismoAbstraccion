package org.example;

import org.example.clases.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto producto1 = new ProductoElectrónico("Laptop", 1000.0, 1, "Proveedor1", 12);
        Producto producto2 = new ProductoAlimenticio("Manzanas", 3.0, 10, "Proveedor2", new Date());

        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);

        Descuento descuento = new Descuento(new CalculadorDePrecioConDescuento(0.10));
        double precioConDescuento = descuento.aplicarDescuento(productos);
        System.out.println("Precio con descuento: " + precioConDescuento);

        descuento.setCalculadorDePrecio(new CalculadorDePrecioSinDescuento());
        double precioSinDescuento = descuento.aplicarDescuento(productos);
        System.out.println("Precio sin descuento: " + precioSinDescuento);

        descuento.setCalculadorDePrecio(new CalculadorDePrecioPorCategoria("Electrónica"));
        double precioCategoria = descuento.aplicarDescuento(productos);
        System.out.println("Precio de productos electrónicos: " + precioCategoria);
    }
}