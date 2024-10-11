/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.pais;
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
        Pais Mypais = new Pais();
        Pais Mypais2 = new Pais();
        Ciudad ciudadWithPa = new Ciudad();
        Ciudad ciudadWithPa2 = new Ciudad();
        
        //ciudadWithPa.name ="Medellin";
        System.out.println("Ingrese el nombre de la ciudad: ");
        ciudadWithPa.name = input.nextLine();
        //ciudadWithPa.population = 10_000;
        System.out.println("Ingrese la poblacion de la ciudad: ");
        ciudadWithPa.population = input.nextInt();
        //ciudadWithPa.presupuesto = 1_000_000_000;
        System.out.println("Ingrese el presupuesto de la ciudad: ");
        ciudadWithPa.presupuesto= input.nextDouble();
        
        //ciudadWithPa2.name ="Barcelona";
        System.out.println("Ingrese el nombre de la ciudad 2: ");
        input.nextLine();
        ciudadWithPa2.name = input.nextLine();
        
        //ciudadWithPa2.population = 100_000;
        System.out.println("Ingrese la poblacion de la ciudad 2: ");
        ciudadWithPa2.population = input.nextInt();
        //ciudadWithPa2.presupuesto = 1_000_000_000;
        System.out.println("Ingrese el presupuesto de la ciudad 2: ");
        ciudadWithPa2.presupuesto = input.nextDouble();
        
        input.nextLine();
        System.out.println("Ingrese el nombre del pais: ");
        Mypais.nombre = input.nextLine();
        System.out.println("Ingrese el nombre de la capital: ");
        Mypais.capital = input.nextLine();
        System.out.println("Ingrese el idioma del pais: ");
        Mypais.idioma = input.nextLine();
        System.out.println("Ingrese la bandera del pais: ");
        Mypais.bandera = input.nextLine();
        System.out.println("Ingrese la poblacion del pais: ");
        Mypais.poblacion = input.nextInt();
        Mypais.ciudad = ciudadWithPa;
        Mypais.continente= Continentes.AMERICA;
        
        input.nextLine();
        System.out.println("Ingrese el nombre del pais2 : ");
        Mypais2.nombre = input.nextLine();
        System.out.println("Ingrese el nombre de la capital: ");
        Mypais2.capital = input.nextLine();
        System.out.println("Ingrese el idioma del pais: ");
        Mypais2.idioma = input.nextLine();
        System.out.println("Ingrese la bandeara del pais: ");
        Mypais2.bandera = input.nextLine();
        System.out.println("Ingrese la poblacion del pais: ");
        Mypais2.poblacion = input.nextInt();
        System.out.println("Ingrese la ciudad del pais: ");
        Mypais2.ciudad = ciudadWithPa2;
        Mypais2.continente= Continentes.EUROPA;
        /*
        Mypais2.ciudad.name ="Barcelona";
        Mypais2.ciudad.population = 100_000;
        Mypais2.ciudad.presupuesto = 1_000_000_000;
        */
        
        /*
        Mypais2.nombre = "España";
        Mypais2.capital = "Madrid";
        Mypais2.idioma = "Español";
        Mypais2.continente = Continentes.EUROPA;
        Mypais2.bandera = "España.jpg";
        Mypais2.poblacion = 10_000_000;
        Mypais2.
        */
        System.out.println("Datos del primer país:");
        System.out.println("Nombre: " + Mypais.nombre);
        System.out.println("Capital: " + Mypais.capital);
        System.out.println("Idioma: " + Mypais.idioma);
        System.out.println("Bandera: " + Mypais.bandera);
        System.out.println("Población: " + Mypais.poblacion);
        System.out.println("Continente: " + Mypais.continente);
        System.out.println("Ciudad: " + Mypais.ciudad.name);
        System.out.println("Población de la ciudad: " + Mypais.ciudad.population);
        System.out.println("Presupuesto de la ciudad: " + Mypais.ciudad.presupuesto);

        System.out.println("Datos del segundo país:");
        System.out.println("Nombre: " + Mypais2.nombre);
        System.out.println("Capital: " + Mypais2.capital);
        System.out.println("Idioma: " + Mypais2.idioma);
        System.out.println("Bandera: " + Mypais2.bandera);
        System.out.println("Población: " + Mypais2.poblacion);
        System.out.println("Continente: " + Mypais2.continente);
        System.out.println("Ciudad: " + Mypais2.ciudad.name);
        System.out.println("Población de la ciudad: " + Mypais2.ciudad.population);
        System.out.println("Presupuesto de la ciudad: " + Mypais2.ciudad.presupuesto);
    }
    
}
