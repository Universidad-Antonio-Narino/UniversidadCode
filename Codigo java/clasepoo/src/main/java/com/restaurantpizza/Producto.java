package com.restaurantpizza;

public class Producto {
    private String nameProduct;
    private TipoProducto tipoProducto;
    private int valor;
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "nameProduct='" + getNameProduct() + ", tipoProducto=" + getTipoProducto() +", valor=" + getValor();
    }
}
