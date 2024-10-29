package com.TaxiExppres;

import com.aspose.barcode.internal.ex.so;

public class Empresa {
    private int nit;
    private String direccion;
    private int telefono;
    private Vehiculo[] vehiculos;
    private Factura[] factura;

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Factura[] getFactura() {
        return factura;
    }

    public void setFactura(Factura[] factura) {
        this.factura = factura;
    }


    public void generarVentas() {
        double ventasTotales = 0;
        for (Factura facturaInfo : factura) {
            for (Servicio servicio : facturaInfo.getDetalleVenta()) {
                
            }
        }
    }
        
}
