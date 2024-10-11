package com.restaurantpizza;

public class Factura {
    private Cliente cliente;
    private Pedido detalle;
    private double impoConsumo;
    private double iva;
    private boolean propina;
    private double total;
    private int valorPropina;

    //metodos propios
    private void calcularImpoConsumo(){
        impoConsumo = total*0.08;
    }

    private void calcularIva(){
        iva = total*0.19;
    }

    private void calcularTotal(){
        for (Menu menu : detalle.getProductos()) {
           total += menu.getPrize();
        }
        calcularImpoConsumo();
        calcularIva();
        total+=impoConsumo+iva;
        if(propina){
            total+=valorPropina;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido getDetalle() {
        return detalle;
    }

    private void setDetalle(Pedido detalle) {
        this.detalle = detalle;
    }

    public double getImpoConsumo() {
        return impoConsumo;
    }

    private void setImpoConsumo(double impoConsumo) {
        this.impoConsumo = impoConsumo;
    }

    public double getIva() {
        return iva;
    }

    private void setIva(double iva) {
        this.iva = iva;
    }

    public boolean isPropina() {
        return propina;
    }

    public void setPropina(boolean propina) {
        this.propina = propina;
    }

    public double getTotal() {
        return total;
    }

    private void setTotal(double total) {
        this.total = total;
    }

    public int getValorPropina() {
        return valorPropina;
    }

    public void setValorPropina(int valorPropina) {
        this.valorPropina = valorPropina;
    }
}
