package com.restaurantpizza;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Mesero waiter = new Mesero();
        Cliente client = new Cliente();
        Scanner keyword = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String name = keyword.nextLine();
        System.out.println("Ingrese el apellido: ");
        String lastName = keyword.nextLine();
        System.out.println("Ingrese su Email: ");
        String email = keyword.nextLine();
        System.out.println("Ingrese su cedula: ");
        int cedula = keyword.nextInt();
        // poblar la clase
        client.setName(name);
        client.setLastName(lastName);
        keyword.nextLine();
        client.setCorreo(email);
        while (client.getCorreo() == null){
            System.out.println("Ingrese su Email: ");
            email = keyword.nextLine();
            client.setCorreo(email);
        }
        client.setCedula(cedula);

        // mesero
        System.out.println("Ingrese el nombre del mesero: ");
        String nameWaiter = keyword.nextLine();
        waiter.setName(nameWaiter);
        waiter.setLastName("pedruÃ±o");

        // productos
        Producto producto1 = new Producto();
        producto1.setNameProduct("pizza-pequeÃ±a");
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
        
        // Producto 1
        Producto producto6 = new Producto();
        producto6.setNameProduct("sándwich-club");
        producto6.setValor(7000);
        producto6.setTipoProducto(TipoProducto.FUERTE);

        // Producto 2
        Producto producto7 = new Producto();
        producto7.setNameProduct("pizza-grande");
        producto7.setValor(12000);
        producto7.setTipoProducto(TipoProducto.FUERTE);

        // Producto 3
        Producto producto8 = new Producto();
        producto8.setNameProduct("limonada");
        producto8.setValor(3000);
        producto8.setTipoProducto(TipoProducto.BEBIDA);

        // Producto 4
        Producto producto9 = new Producto();
        producto9.setNameProduct("croquetas-de-pollo");
        producto9.setValor(4500);
        producto9.setTipoProducto(TipoProducto.ACOMPANAMIENTO);

        // Producto 5
        Producto producto10 = new Producto();
        producto10.setNameProduct("mozzarella-sticks");
        producto10.setValor(5000);
        producto10.setTipoProducto(TipoProducto.POSTRE);

        // Producto 6
        Producto producto11 = new Producto();
        producto11.setNameProduct("cheesecake-de-fresa");
        producto11.setValor(5500);
        producto11.setTipoProducto(TipoProducto.POSTRE);

        // Producto 7
        Producto producto12 = new Producto();
        producto12.setNameProduct("té-frío");
        producto12.setValor(2500);
        producto12.setTipoProducto(TipoProducto.BEBIDA);
        

        Menu[] menuDia = new Menu[2];

        menuDia[0].setName("menu combo todo en uno");
        menuDia[0].setPrize(45000);
        
        menuDia[1].setName("Felicidades");
        menuDia[1].setPrize(50000);
        
        
        Producto[] combos1 = new Producto[5];
        combos1[0] = producto1;
        combos1[1] = producto2;
        combos1[2] = producto3;
        combos1[3] = producto4;
        combos1[4] = producto5;
        
        Producto[] combos2 = new Producto[5];
        combos2[0]=producto6;
        combos2[1]=producto7;
        combos2[2]=producto8;
        combos2[3]=producto9;
        combos2[4]=producto10;
        
        Producto[] combos3 = new Producto[2];
        combos3[0]=producto11;
        combos3[1]=producto12;
  

        // muestra que la info ya fue guardada
        /*
         * 
         * for (Producto producto : combos) {
         * System.out.println(producto);
         * }
         */

        // forma 1 de estraer sin que me envia su referencia de memoria de la class
        menuDia[0].setProducto(combos1);
        menuDia[1].setProducto(combos2);
        menuDia[2].setProducto(combos3);
        
        for(int i = 0;i<3;i++){
            for (Producto eleProducto : menuDia[i].getProducto()) {
                System.out.println(eleProducto);
            }
        }
        

        Pedido pedido1 = new Pedido();
        pedido1.setDate("10-11-2024");
        pedido1.setMesero(waiter);
        pedido1.setTable(1);
        pedido1.setProductos(menuDia);

        Factura factura1 = new Factura();
        factura1.setCliente(client);
        factura1.setPropina(true);
        factura1.setValorPropina(10000);
        factura1.setDetalle(pedido1);
        System.out.println(factura1);
    }
}
