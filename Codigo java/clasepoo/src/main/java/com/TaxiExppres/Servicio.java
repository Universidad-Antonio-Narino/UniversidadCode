package com.TaxiExppres;

import java.time.Duration;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Servicio {
    private Cliente cliente;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Vehiculo vehiculo;
    private int unidadesRecorridas;
    private double costo;

   
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getUnidadesRecorridas() {
        return unidadesRecorridas;
    }

    public void setUnidadesRecorridas(int unidadesRecorridas) {
        this.unidadesRecorridas = unidadesRecorridas;
    }

    public void CalcularCosto(){
        Duration duracion = Duration.between(horaInicio, horaFin);
        long diferenciaSegundos = duracion.getSeconds();
    }

    public void iniciarViaje(){
        Scanner kScanner = new Scanner(System.in);
        fecha = LocalDate.now();
        System.out.println("Ingrese el tiempo en el cual inicio su viaje \n Formato debe ser HH:mm:ss: ");
        String horaInicial = kScanner.nextLine();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime hora1 = LocalTime.parse(horaInicial, formatoHora);
        horaInicio = hora1;
        

    }
    public void finalizarViaje(){
        Random random = new Random();
        unidadesRecorridas = random.nextInt(400);
        Scanner kScanner = new Scanner(System.in);

        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Ingrese el tiempo en el cual inicio su viaje \n Formato debe ser HH:mm:ss: ");
        String horaFinal = kScanner.nextLine();
        LocalTime hora2 = LocalTime.parse(horaFinal, formatoHora);
        horaFin=hora2;
    }

}
