package com.TaxiExppres;

import java.util.Date;

public class Factura {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Date fecha;
    private Servicio detalleVenta[];

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Servicio[] getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(Servicio[] detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public void generarFactura(){

    }
}
