package com.TaxiExppres;


public class Main {
    public static void main(String[] args) {
        Plataforma app = new Plataforma();
        //app.registrarse();
        //app.registrarse();
        //app.login();
        Servicio servicio = new Servicio();
        
        servicio.CalcularCosto();
    }
}
