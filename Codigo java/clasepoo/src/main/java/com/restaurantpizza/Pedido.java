package com.restaurantpizza;

import java.util.ArrayList;

public class Pedido {
    private String date;
    private int table;
    private Mesero mesero;
    private ArrayList<Menu> productos = new ArrayList<>();
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public ArrayList<Menu> getProductos() {
        return productos;
    }

    public void setProductos(Menu productosE) {
        this.productos.add(productosE);
    }
}
