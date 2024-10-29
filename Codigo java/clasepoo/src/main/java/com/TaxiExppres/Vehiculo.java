package com.TaxiExppres;

//import com.aspose.barcode.License;
//import com.aspose.barcode.generation.BarCodeImageFormat;
//import com.aspose.barcode.generation.BarcodeGenerator;
//import com.aspose.barcode.generation.EncodeTypes;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int kilometrosDependenciaCombustible;
    private Empleados[] conductor;

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

    public int getKilometrosDependenciaCombustible() {
        return kilometrosDependenciaCombustible;
    }

    public void setKilometrosDependenciaCombustible(int kilometrosDependenciaCombustible) {
        this.kilometrosDependenciaCombustible = kilometrosDependenciaCombustible;
    }

    public Empleados[] getConductor() {
        return conductor;
    }

    public void setConductor(Empleados[] conductor) {
        this.conductor = conductor;
    }

    public boolean tanqueVacio(){
        return false;
    }

    public void generadorQr(){
        System.out.println("IN PROCESS");
    }
}
