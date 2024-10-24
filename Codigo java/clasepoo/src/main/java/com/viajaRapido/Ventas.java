package com.viajaRapido;

public class Ventas {

    private Empresa empresa;
    private Ticket[] ticket;
    private double total;

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
        //imprimir subtotal
        System.out.println("Subtotal: ");
        double subtotalImpresion = subtotal(ticket);
        System.out.println("Subtotal de rutas: "+subtotalImpresion);
        //imprimir productos con iva
        double calcularIvaTotal = calcularIva(ticket);
        //imprimir total con iva
        this.total = subtotalImpresion+calcularIvaTotal;
        return total;
    }
    
    public double subtotal(Ticket[] ticket){
        double totalVentasDia = 0;
        int ciclo = this.ticket.length;//tamaño lista
        //System.out.println("Ciclos: " + ciclo);
        Ticket[] ticketsVendidos = new Ticket[ciclo];//nuevo array de tiketes con el numero de elementos de ticket guardado en el objeto

        for (int i = 0; i < ciclo; i++) {
            ticketsVendidos[i] = getTicket()[i];
            totalVentasDia += ticketsVendidos[i].getRuta().getPrecio()*ticketsVendidos[i].getCantidadPasajes();
            System.out.println("Ruta: " + ticketsVendidos[i].getRuta().getNombreRuta() + " - Valor unitario: $" + ticketsVendidos[i].getRuta().getPrecio());
            System.out.println("\t Subtotal por ruta: \n\t Ruta: " + ticketsVendidos[i].getRuta().getNombreRuta() +"\n\t Cantidad tickets: "+ticketsVendidos[i].getCantidadPasajes() +" -> Valor: $"+ticketsVendidos[i].getRuta().getPrecio()*ticketsVendidos[i].getCantidadPasajes()+"\n");
            
        }
        return totalVentasDia;
    }

    public double calcularIva(Ticket[] ticket){
        double ivaTotal = 0;
        for (Ticket ticket2 : ticket) {
            ivaTotal += ticket2.getRuta().getPrecio()*ticket2.getCantidadPasajes();
        }
        ivaTotal=ivaTotal*0.19;
        System.out.println("El precio total del iva de las rutas es de: "+ ivaTotal);
        return ivaTotal;
    }
    
    public double imprimirVentas(Ticket[] ticket){
        double total = calcularTotal(ticket);
    
        return total;
    }
}