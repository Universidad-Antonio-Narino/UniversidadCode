package com.viajaRapido;

public class Ruta {
    private String nombreRuta;
    private String origen;
    private String destino;
    private int codRuta;
    private float duracion;
    private int precio;

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the codRuta
     */
    public int getCodRuta() {
        return codRuta;
    }

    /**
     * @param codRuta the codRuta to set
     */
    public void setCodRuta(int codRuta) {
        this.codRuta = codRuta;
    }

    /**
     * @return the duracion
     */
    public float getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the nombreRuta
     */
    public String getNombreRuta() {
        return nombreRuta;
    }

    /**
     * @param nombreRuta the nombreRuta to set
     */
    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }
    
}
