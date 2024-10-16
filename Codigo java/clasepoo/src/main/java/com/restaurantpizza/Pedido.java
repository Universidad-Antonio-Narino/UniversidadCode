package com.restaurantpizza;

import java.util.ArrayList;

public class Pedido {
    private String date;
    private int table;
    private Mesero mesero;
    private Menu[] productMenu;
    
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

    public Menu[] getProductos() {
        return productMenu;
    }

    public void setProductos(Menu[] productosE) {
        this.productMenu=productosE;
    }
}
