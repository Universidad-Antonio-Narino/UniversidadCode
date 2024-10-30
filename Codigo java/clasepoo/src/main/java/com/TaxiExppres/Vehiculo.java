package com.TaxiExppres;

import java.util.Random;
import java.util.Scanner;

//import com.aspose.barcode.License;
//import com.aspose.barcode.generation.BarCodeImageFormat;
//import com.aspose.barcode.generation.BarcodeGenerator;
//import com.aspose.barcode.generation.EncodeTypes;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private double capacidadCombustible;
    private double tanqueCombustible;
    private Empleados conductor;
    private boolean conbustibleVacio = false;

    public Empleados getConductor() {
        return conductor;
    }

    public void setConductor(Empleados conductor) {
        this.conductor = conductor;
    }
    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible() {
        Random random = new Random();
        this.capacidadCombustible = Math.round(5.0 + (random.nextDouble() * (12.0 - 5.0)));
        setTanqueCombustible();
    }
    public double getTanqueCombustible() {
        return tanqueCombustible;
    }

    public void setTanqueCombustible() {
        this.tanqueCombustible = getCapacidadCombustible();
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public boolean tanqueVacio(){
        return conbustibleVacio;
    }

    public void GastoGasolina(double distancia){
        double gastoGasolinaKilometro = capacidadCombustible/100;
        tanqueCombustible -=(gastoGasolinaKilometro*distancia);
        if (tanqueCombustible <= 0.5)
            conbustibleVacio = true;
    }

    public void tankear(double presupuesto){
        int precioGalon = 9000;
        presupuesto = presupuesto*0.15;
        tanqueCombustible +=(presupuesto/precioGalon);
        if (tanqueCombustible > 1.5 || tanqueCombustible == capacidadCombustible){
            conbustibleVacio = false;
        }
    }

    public void generadorQr(){
        System.out.println("IN PROCESS");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", tanqueCombustible=" + tanqueCombustible +
                ", conductor=" + conductor +
                ", conbustibleVacio=" + conbustibleVacio +
                '}';
    }
}
