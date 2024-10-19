/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.viajaRapido;
import java.util.Scanner;

/**
 *
 * @author SALA G
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //crear client
        Cliente cliente = new Cliente();
        System.out.println("Ingrese Su nombre: ");
        String name = input.nextLine();
        System.out.println("Ingrese Su cedula: ");
        int cedula = input.nextInt();
        System.out.println("Ingrese su correo: ");
        String correo = input.nextLine();
        input.nextLine();
        System.out.println("Ingrese su telefono: ");
        int telefono = input.nextInt();
        
        cliente.setNombre(name);
        cliente.setCedula(cedula);
        cliente.setCorreo(correo);
        cliente.setTelefono(telefono);
        
        //crear Empresa
        Empresa empresa = new Empresa();
        input.nextLine();
        System.out.println("Ingrese el nombre de la empresa: ");
        String nombreEmpresa = input.nextLine();
        System.out.println("Ingrese el nit de la empresa: ");
        int nit = input.nextInt();
        System.out.println("Ingrese el numero de la empresa: ");
        int telefonoEmpresa = input.nextInt();
        
        empresa.setNombre(name);
        empresa.setNit(nit);
        empresa.setTelefono(telefono);
        //crear Ciudad debe ser array
        Ciudad[] ciudad = new Ciudad[6];
        ciudad[0] = new Ciudad();
        ciudad[0].setNombre("Medellin");
        ciudad[1] = new Ciudad();
        ciudad[1].setNombre("Bogota");
        ciudad[2] = new Ciudad();
        ciudad[2].setNombre("Pasto");
        ciudad[3] = new Ciudad();
        ciudad[3].setNombre("Guajira");
        ciudad[4] = new Ciudad();
        ciudad[4].setNombre("Barranquilla");
        ciudad[5] = new Ciudad();
        ciudad[5].setNombre("Amazonas");
        //crear bus
        Bus[] bus = new Bus[2];
        bus[0] = new Bus();
        bus[0].setPlaca("117-abv");
        bus[0].setSillas(40);
        bus[1] = new Bus();
        bus[1].setPlaca("111-avg");
        bus[1].setSillas(30);
        
        //crear ruta
        Ruta[] ruta = new Ruta[3];
        ruta[0] =new Ruta();
        ruta[0].setCodRuta(0);
        ruta[0].setOrigen(ciudad[1]);
        ruta[0].setDestino(ciudad[0]);
        ruta[0].setDuracion(90);
        ruta[0].setPrecio(80000);
        ruta[1] = new Ruta();
        ruta[1].setCodRuta(2);
        ruta[1];
        ruta[1];
        ruta[1];
        ruta[1]; 
        //crear el ticket
    }
    
}
