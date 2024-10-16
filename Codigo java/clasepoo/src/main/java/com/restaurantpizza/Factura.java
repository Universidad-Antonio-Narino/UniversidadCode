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
        double impustoConsumo = getTotal()*0.08;
        setImpoConsumo(impustoConsumo);
    }

    private void calcularIva(){
        iva = total*0.19;
    }

    private void calcularTotal(){
        for (Menu menu : detalle.getProductos()) {
           total += menu.getPrecio();
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

    public void setDetalle(Pedido detalle) {
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
    //sobreescritura aun no vista
    /*
     * 
     @Override 
     public String toString() {
        String infoClass = """
            \t Restaurante  pizzeria \t
            \t\t factura de compra \t\t
            Datos Cliente:
            Nombre: %s
            Apellido: %s
            cedula: %d
            Email: %s
            Datos del pedido: 
            Fecha: %s
            Pedido de Mesa: %d
            Nombre Mesero: %s %s
            Menu
            """;
            return String.format(infoClass,getCliente().getName(),getCliente().getLastName(),getCliente().getCedula(),getCliente().getCorreo(),getDetalle().getDate(),getDetalle().getTable(),getDetalle().getMesero().getName(),getDetalle().getMesero().getLastName()) ;
        }
    */
}
