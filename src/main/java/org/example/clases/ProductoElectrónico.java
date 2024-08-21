package org.example.clases;

public class ProductoElectrónico extends Producto{

    private int garantia;

    public ProductoElectrónico(String nombre, double precio, int cantidad, String proveedor, int garantia) {
        super(nombre, precio, cantidad, proveedor);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String getDetalles() {
        return "Producto Electrónico: " + getNombre() + ", Precio: " + getPrecio() + ", Cantidad: " + getCantidad() +
                ", Proveedor: " + getProveedor() + ", Garantía: " + garantia + " meses";
    }

}
