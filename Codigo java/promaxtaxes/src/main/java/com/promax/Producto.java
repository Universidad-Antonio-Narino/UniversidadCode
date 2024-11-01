package com.promax;

public class Producto {
    private String[] tipoCredito = {"Vehiculo","Vivienda","Libre Inversion"};
    private Double[] tasas = {0.02,0.012,0.05};
    private int[] tiempo = {5,20,3};

    public String[] getTipoCredito() {
        return tipoCredito;
    }

    private void setTipoCredito(String[] tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public Double[] getTasas() {
        return tasas;
    }

    private void setTasas(Double[] tasas) {
        this.tasas = tasas;
    }

    public int[] getTiempo() {
        return tiempo;
    }

    private void setTiempo(int[] tiempo) {
        this.tiempo = tiempo;
    }
}
