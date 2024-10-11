package com.restaurantpizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mesero waiter = new Mesero();
        Cliente client = new Cliente();
        /*
         * 
         Scanner keyword = new Scanner(System.in);
         System.out.println("Ingrese el nombre: ");
         String name = keyword.nextLine();
         System.out.println("Ingrese el apellido: ");
         String lastName = keyword.nextLine();
         System.out.println("Ingrese su Email: ");
         String email = keyword.nextLine();
         
         //poblar la clase
         client.setName(name);
         client.setLastName(lastName);
        client.setCorreo(email);
        
        //mesero
        System.out.println("Ingrese el nombre del mesero: ");
        String nameWaiter = keyword.nextLine();
        waiter.setName(nameWaiter);
        */
        
        //productos
        Producto producto1 = new Producto();
        producto1.setNameProduct("pizza-pequeña");
        producto1.setValor(6000);
        producto1.setTipoProducto(TipoProducto.FUERTE);

        Producto producto2 = new Producto();
        producto2.setNameProduct("pizza-Familiar");
        producto2.setValor(16000);
        producto2.setTipoProducto(TipoProducto.FUERTE);

        Producto producto3 = new Producto();
        producto3.setNameProduct("Limonada");
        producto3.setValor(5000);
        producto3.setTipoProducto(TipoProducto.BEBIDA);

        Producto producto4 = new Producto();
        producto4.setNameProduct("Helado");
        producto4.setValor(1500);
        producto4.setTipoProducto(TipoProducto.ACOMPANAMIENTO);

        Producto producto5 = new Producto();
        producto5.setNameProduct("pastel de agraz");
        producto5.setValor(16000);
        producto5.setTipoProducto(TipoProducto.POSTRE);

        Menu menuDia = new Menu();

        menuDia.setName("menu combo todo en uno");
        menuDia.setPrize(45000);
        Producto[] combos = new Producto[5];
        combos[0] = producto1;
        combos[1] = producto2;
        combos[2] = producto3;
        combos[3] = producto4;
        combos[4] = producto5;
        for (Producto producto : combos) {
            System.out.println(producto);
        }
        // forma 1 de estraer sin que me envia su referencia de memoria de la class
        menuDia.setProducto(combos);
        for (Producto eleProducto : menuDia.getProducto()) {
            System.out.println(eleProducto);
        }
    }
}
