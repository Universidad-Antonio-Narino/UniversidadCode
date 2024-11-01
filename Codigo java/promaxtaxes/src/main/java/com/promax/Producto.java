package com.promax;

import java.util.Scanner;
public class Producto {
    private String tipoCredito;
    private Double tasas;
    private int tiempo;

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public Double getTasas() {
        return tasas;
    }

    public void setTasas(Double tasas) {
        this.tasas = tasas;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo*12;
    }
    @Override
    public String toString() {
        return "Producto{" +
                "tipoCredito='" + tipoCredito + '\'' +
                ", tasas=" + tasas +
                ", tiempo=" + tiempo +
                '}';
    }
}
