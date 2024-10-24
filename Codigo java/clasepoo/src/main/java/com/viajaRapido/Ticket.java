package com.viajaRapido;

public class Ticket {
    private String fecha;
    private Ruta ruta;
    //Ya esta en ruta
    //private int precio
    private Bus bus;
    private Cliente cliente;
    private int id;
    private int cantidadPasajes;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadPasajes() {
        return cantidadPasajes;
    }

    public void setCantidadPasajes(int cantidadPasajes) {
        this.cantidadPasajes = cantidadPasajes;
    }
    @Override
    public String toString() {
        String infoTicket = "Ticket # %d \t\n Fecha: %s \t\n cantidad pasajes: %d";
        return String.format(infoTicket,id,fecha,cantidadPasajes);
    }
}