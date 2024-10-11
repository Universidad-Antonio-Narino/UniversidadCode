/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.encapsulamiento;

/**
 *
 * @author SALA G
 */
public class Factura {
    private Cliente cliente;
    private Pedido detalle;
    private double inpoConsumo;
    private double iva;
    private boolean propina;
    private double total;
    private int valorPropina;

    public int getValorPropina() {
        return valorPropina;
    }
    
    public Cliente getCliente(){
       return this.cliente; 
    }
    public Pedido getDetalle(){
       return this.detalle; 
    }
    public double getInpoConsumo(){
       return this.inpoConsumo; 
    }
    public double getIva(){
       return this.iva; 
    }
    public boolean getPropina(){
       return this.propina; 
    }
    public double getTotal(){
       return this.total; 
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private void setDetalle(Pedido detalle) {
        this.detalle = detalle;
    }

    private void setInpoConsumo(double inpoConsumo) {
        this.inpoConsumo = inpoConsumo;
    }

    private void setIva(double iva) {
        this.iva = iva;
    }

    public void setPropina(boolean propina) {
        this.propina = propina;
    }

    private void setTotal(double total) {
        this.total = total;
    }

    private void setValorPropina(int valorPropina) {
        this.valorPropina = valorPropina;
    }
    
    public void CalcularImpoConsumo(){
        
    }
    public void CalcularIva(){
        this.iva = this.inpoConsumo*0.19;
    }
    public void CalcularTotal(){
        this.total = this.inpoConsumo + this.iva;
    }
}
