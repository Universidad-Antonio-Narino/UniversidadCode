package com.pizza;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Cliente clientecCliente = new Cliente();
        clientecCliente.setName("Carlos");
        System.out.println("Su nombre es "+clientecCliente.getName());
    }
}