package com.TaxiExppres;

import java.util.Date;

public class Factura {
    private Cliente cliente;
    private Vehiculo vehiculo;
    
    private Servicio[] detalleVenta;

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

    public Servicio[] getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(Servicio[] detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public void generarFactura(){
        System.out.println("Nombre conductor: "+ vehiculo.getConductor().getNombreConductor());

        System.out.println("Marca: "+vehiculo.getMarca());
        System.out.println("Modelo: "+vehiculo.getModelo());
        System.out.println("Placa: "+vehiculo.getPlaca());
        System.out.println("Cliente nombre: "+cliente.getName());
        System.out.println("identificacion: "+cliente.getCedula());
        System.out.println("Correo: "+cliente.getCorreo());
        for (Servicio servicio : detalleVenta) {
            System.out.println("Unidades recorrida: "+servicio.getUnidadesRecorridas());
            System.out.println("Costo: "+servicio.getCosto());
            System.out.println("Fecha: "+servicio.getFecha());
            System.out.println("Hora inicio del servicio: "+servicio.getHoraInicio());
            System.out.println("Hora fin del servicio: "+servicio.getHoraFin());
        }
    }
    
}
