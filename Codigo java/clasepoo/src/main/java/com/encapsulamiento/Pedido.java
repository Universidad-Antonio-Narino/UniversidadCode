
package com.encapsulamiento;

/**
 *
 * @author JEGONZALEZT
 */
public class Pedido {
    
    private String fecha;        
    
    private int mesa;
    
    private Mesero mesero;
    
    private Menu[] productos;
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public Menu[] getProductos() {
        return productos;
    }

    public void setProductos(Menu[] productos) {
        this.productos = productos;
    }
    
    
}
