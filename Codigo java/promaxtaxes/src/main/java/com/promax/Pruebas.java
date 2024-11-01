package com.promax;

public class Pruebas {
    public static void main(String[] args) {
        Cliente[] registrados=new Cliente[2];
        Cliente cliente = new Cliente();
        registrados[0] = cliente.Register(registrados);
        for (Cliente cliente2 : registrados) {
            System.out.println(cliente2);
        }
        cliente = cliente.login(registrados);
        System.out.println(cliente);
    }
}
