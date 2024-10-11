/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.pais2;

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
        Pais Mypais = new Pais();
        Pais Mypais2 = new Pais();
        Ciudad ciudadWithPa = new Ciudad();
        Ciudad ciudadWithPa2 = new Ciudad();
        
        ciudadWithPa.name ="Medellin";
        ciudadWithPa.population = 10000;
        ciudadWithPa.presupuesto = 1000000000;
        
        ciudadWithPa2.name ="Barcelona";
        ciudadWithPa2.population = 100000;
        ciudadWithPa2.presupuesto = 1000000000;
        
        
        Mypais.nombre = "Polombia";
        Mypais.capital = "bogota";
        Mypais.idioma = "Español latino";
        Mypais.bandera = "Colombia.jpg";
        Mypais.poblacion = 10_000_000;
        Mypais.ciudad = ciudadWithPa;
        Mypais.continente= Continentes.AMERICA;
        
        Mypais2.nombre = "España";
        Mypais2.capital = "Madrid";
        Mypais2.idioma = "Español";
        Mypais2.bandera = "España.jpg";
        
        Mypais.ciudad = ciudadWithPa2;
        /*
        Mypais2.ciudad.name ="Barcelona";
        Mypais2.ciudad.population = 100_000;
        Mypais2.ciudad.presupuesto = 1_000_000_000;
        */
        Mypais2.poblacion = 100_000_000;
        Mypais2.continente= Continentes.EUROPA;
        
        
        
        /*
        Mypais2.nombre = "España";
        Mypais2.capital = "Madrid";
        Mypais2.idioma = "Español";
        Mypais2.continente = Continentes.EUROPA;
        Mypais2.bandera = "España.jpg";
        Mypais2.poblacion = 10_000_000;
        Mypais2.
        */
        System.out.println("Nombre Pais: "+Mypais.nombre+"\n Capital"+Mypais.capital+"\n Continente"+Mypais.continente+"\n idioma: "+Mypais.idioma+"\n bandera "+Mypais.bandera+" \n Poblacion "+Mypais.poblacion);
        //System.out.println("Nombre pais"+Mypais.nombre+"\n ciudad "+Mypais.ciudad.name+" \n presupuesto"+Mypais.ciudad.presupuesto);
        System.out.println("Nombre Pais: "+Mypais2.nombre+"\n Capital"+Mypais2.capital+"\n Continente"+Mypais2.continente+"\n idioma: "+Mypais2.idioma+"\n bandera "+Mypais2.bandera+" \n Poblacion "+Mypais2.poblacion);
    }
    
}
