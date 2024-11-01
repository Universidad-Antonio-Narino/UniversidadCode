package com.promax;

public class Banco {
    private String bankName;
    private int Nit;
    private String direccion;
    private int cantidadClientesCredito;
    private int totalDineroPrestado;
    private boolean Adaptabilidad;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getNit() {
        return Nit;
    }

    public void setNit(int nit) {
        Nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadClientesCredito() {
        return cantidadClientesCredito;
    }

    public void setCantidadClientesCredito(int cantidadClientesCredito) {
        this.cantidadClientesCredito = cantidadClientesCredito;
    }

    public int getTotalDineroPrestado() {
        return totalDineroPrestado;
    }

    public void setTotalDineroPrestado(int totalDineroPrestado) {
        this.totalDineroPrestado = totalDineroPrestado;
    }

    public boolean isAdaptabilidad() {
        return Adaptabilidad;
    }

    public void setAdaptabilidad(boolean adaptabilidad) {
        Adaptabilidad = adaptabilidad;
    }
    private void calcularAdaptabilidad(){

    }
    public void generarTablaAmortizacion(){
        
    }
}
