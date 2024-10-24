package com.viajaRapido;

public class Ticket {
    private String fecha;
    private Ruta ruta;
    //Ya esta en ruta
    //private int precio
    private int sillaEscogida;
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

    public int getSillaEscogida() {
        return sillaEscogida;
    }

    public void setSillaEscogida(int sillaEscogida) {
        this.sillaEscogida = sillaEscogida;
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

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cantidadPasajes
     */
    public int getCantidadPasajes() {
        return cantidadPasajes;
    }

    /**
     * @param cantidadPasajes the cantidadPasajes to set
     */
    public void setCantidadPasajes(int cantidadPasajes) {
        this.cantidadPasajes = cantidadPasajes;
    }
}
