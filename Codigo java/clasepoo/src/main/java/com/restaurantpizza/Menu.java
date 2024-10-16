package com.restaurantpizza;

public class Menu {
    private String nombre;
    
    private int precio;
    
    private Producto[] producto;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Producto[] getProducto() {
        return producto;
    }
    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }
}
