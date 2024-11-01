package com.promax;

public class SolicitudCredito {
    private double ingresos;
    private int monto;
    private Producto tipoCredito;
    private double gastos;
    private int capacidadPago;
    
    
    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Producto getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(Producto tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public int getCapacidadPago() {
        return capacidadPago;
    }

    public void setCapacidadPago(int capacidadPago) {
        this.capacidadPago = capacidadPago;
    }
}
