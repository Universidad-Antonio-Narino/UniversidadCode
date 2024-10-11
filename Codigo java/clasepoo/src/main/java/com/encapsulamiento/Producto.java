
package com.encapsulamiento;

/**
 *
 * @author JEGONZALEZT
 */
public class Producto {
    
    private String nombre;
    
    private int valor;
    
    private TipoProducto tipoProducto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
    
}
