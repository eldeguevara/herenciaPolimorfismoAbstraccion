package org.example.clases;

import java.util.Date;

public class ProductoAlimenticio extends Producto{

    private Date fechaDeCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidad, String proveedor, Date fechaDeCaducidad) {
        super(nombre, precio, cantidad, proveedor);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public Date getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(Date fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public String getDetalles() {
        return "Producto Alimenticio: " + getNombre() + ", Precio: " + getPrecio() + ", Cantidad: " + getCantidad() +
                ", Proveedor: " + getProveedor() + ", Fecha de Caducidad: " + fechaDeCaducidad;
    }

}
