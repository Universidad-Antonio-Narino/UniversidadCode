package com.pizza;

import java.time.LocalDate;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Cliente client1 = new Cliente();
        Empleado empleado1 = new Empleado();
        Establecimiento establecimiento1 = new Establecimiento();
        Factura factura1 = new Factura();
        Menu menu = new Menu();
        Pedido pedido1 = new Pedido();
        Producto producto1 = new Producto();

        client1.setName("Juano");
        client1.setLastName("Pedruano");
        client1.setEmail("laland@uan.edu.co");
        client1.setIdentification(10000000);

        empleado1.setNombreEmpleado("Pedruño");
        empleado1.setCargo("Cajero");

        establecimiento1.setNameEmpresa("La parrilla");
        establecimiento1.setDireccion("cra55# 34");
        establecimiento1.setNit(1115414158);
        
        factura1.setFecha(LocalDate.now().toString());

    }
}