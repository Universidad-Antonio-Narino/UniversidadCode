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


    /**
     * @return the empresa
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the ticket
     */
    public Ticket[] getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(Ticket[] ticket) {
        this.ticket = ticket;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    // Para calcular el total de las ventas se debe obtener
    // el valor de venta de cada Tickete
    // Se envia a este método el array de ticketes
    private double calcularTotal(Ticket[] ticket) {
        double totalVentasDia = 0;
        int ciclo = this.ticket.length;
        System.out.println("Ciclos: " + ciclo);
        Ticket[] ticketsVendidos = new Ticket[ciclo];

        for (int i = 0; i < ciclo; i++) {
            ticketsVendidos[i] = getTicket()[i];
            totalVentasDia += ticketsVendidos[i].getRuta().getPrecio()*ticketsVendidos[i].getCantidadPasajes();
            System.out.println("Ruta: " + ticketsVendidos[i].getRuta().getNombreRuta() + " - Valor: $" + ticketsVendidos[i].getRuta().getPrecio());
        }

        this.total = totalVentasDia;
        return totalVentasDia;
    }
    
    public double subtotal(){
        double totalVentasDia = 0;
        int ciclo = this.ticket.length;
        System.out.println("Ciclos: " + ciclo);
        Ticket[] ticketsVendidos = new Ticket[ciclo];

        for (int i = 0; i < ciclo; i++) {
            ticketsVendidos[i] = getTicket()[i];
            totalVentasDia += ticketsVendidos[i].getRuta().getPrecio()*ticketsVendidos[i].getCantidadPasajes();
            System.out.println("Ruta: " + ticketsVendidos[i].getRuta().getNombreRuta() + " - Valor: $" + ticketsVendidos[i].getRuta().getPrecio());
        }

        this.total = totalVentasDia;
        return totalVentasDia;
    }
    
    public double imprimirVentas(Ticket[] ticket){
        
        double totalesDia = calcularTotal(ticket);                        
        return totalesDia;
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
