package com.promax;

import java.util.Scanner;
public class SolicitudCredito {
    private double ingresos;
    private int monto;
    private Producto tipoCredito;
    private double gastos;
    private int cuota;
    private double capacidadPago;
 

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        Scanner keyword = new Scanner(System.in);
        if (cuota<tipoCredito.getTiempo()) {
            System.out.println("No se puede realizar el credito las cuotas no superan el tiempo minimo");
            System.out.println("Cuotas minimas para el credito = "+tipoCredito.getTiempo());
            System.out.println("Ingrese de nuevo una cuota valida: ");
            int cuotaValida = keyword.nextInt();
            setCuota(cuotaValida);
        }else{
            this.cuota = cuota;
        }

    }
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

    public Double getCapacidadPago() {
        return capacidadPago;
    }

    public void setCapacidadPago() {
        double capacidadPago = ingresos-gastos;
        this.capacidadPago = capacidadPago;
    }
    @Override
    public String toString() {
        return "SolicitudCredito{" +
                "ingresos=" + ingresos +
                ", monto=" + monto +
                ", tipoCredito=" + tipoCredito +
                ", gastos=" + gastos +
                ", cuota=" + cuota +
                ", capacidadPago=" + capacidadPago +
                '}';
    }
}
