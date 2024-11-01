package com.promax;

public class Pruebas {
    public static void main(String[] args) {
        Cliente[] cliente = new Cliente[2];
        Cliente cliente1 = new Cliente();
        cliente1.Register(cliente);
        cliente[0] = cliente1;
        Cliente cliente2 = new Cliente();
        cliente2.Register(cliente);
        cliente[1] = cliente2;

        for (Cliente cliente3 : cliente) {
            System.out.println(cliente3);
            if (cliente3 == cliente1) {
                System.out.println("Si es igual al cliente 1");
            }
            if (cliente3 == cliente2) {
                System.out.println("Si es igual al cliente 2");
            }
        }

    }
}
