package com.promax;

import java.lang.Math;

public class Banco {
    private String bankName;
    private int Nit;
    private String direccion;
    private int cantidadClientesCredito;
    private long totalDineroPrestado;
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

    public long getTotalDineroPrestado() {
        return totalDineroPrestado;
    }

    public void setTotalDineroPrestado(int totalDineroPrestado) {
        this.totalDineroPrestado = totalDineroPrestado;
    }

    public boolean getIsAdaptabilidad() {
        return Adaptabilidad;
    }

    public void setAdaptabilidad(boolean adaptabilidad) {
        Adaptabilidad = adaptabilidad;
    }

    public void calcularAdaptabilidad(Cliente clienteSolicitaCliente) {
        double estudioAptabilidad = clienteSolicitaCliente.getCreditoCliente().getIngresos() * 0.35;
        double capacidadPago =clienteSolicitaCliente.getCreditoCliente().getCapacidadPago();

        // Analisis
        double cuotaFijaMensual = Math.round((clienteSolicitaCliente.getCreditoCliente().getMonto()
                * clienteSolicitaCliente.getCreditoCliente().getTipoCredito().getTasas())
                / (1 - Math.pow((1 + clienteSolicitaCliente.getCreditoCliente().getTipoCredito().getTasas()),
                        -clienteSolicitaCliente.getCreditoCliente().getCuota()))*100)/100;
        if (capacidadPago >= estudioAptabilidad) {
            System.out.println("Usted es apto para el credito");
            clienteSolicitaCliente.getCreditoCliente().setCuotaFijaMensual(Math.round(cuotaFijaMensual*100)/100);
            Adaptabilidad = true;
            generarTablaAmortizacion(clienteSolicitaCliente);
        } else {
            System.out.println("No eres apto");

        }

    }

    public void generarTablaAmortizacion(Cliente clienteSolicitaCliente) {
        // en conclusion ese string builder mejora la cadena es la combinacion de
        // centers en python
        StringBuilder tabla = new StringBuilder();
        tabla.append(
                "----------------------------------------------------------------------------------------\n");
        tabla.append(String.format("| %-6s | %-18s | %-15s | %-21s | %-12s |\n",
                "Cuota", "Cuota fija mensual", "Interes mensual", "Amortizacion capital", "Deuda total"));
        tabla.append(
                "-----------------------------------------------------------------------------------------\n");

        double cuotaFmensual = clienteSolicitaCliente.getCreditoCliente().getCuotaFijaMensual();
        double interesesMensu = Math.round((clienteSolicitaCliente.getCreditoCliente().getTipoCredito().getTasas()
                * clienteSolicitaCliente.getCreditoCliente().getMonto()*100))/100;
        double amortizacionCredito = cuotaFmensual - interesesMensu;
        double deudaTotal = clienteSolicitaCliente.getCreditoCliente().getMonto() - amortizacionCredito;

        for (int i = 1; i <= clienteSolicitaCliente.getCreditoCliente().getCuota(); i++) {
            tabla.append(String.format("| %-6d | %-18.2f | %-15.2f | %-21.2f | %-12.2f |\n",
                    i, cuotaFmensual, interesesMensu, amortizacionCredito, deudaTotal));

            interesesMensu = Math
                    .round((deudaTotal * clienteSolicitaCliente.getCreditoCliente().getTipoCredito().getTasas())*100)/100;
            amortizacionCredito = cuotaFmensual - interesesMensu;
            deudaTotal -= amortizacionCredito;
        }

        System.out.println(tabla.toString());
    }
}
