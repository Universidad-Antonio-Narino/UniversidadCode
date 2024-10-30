package com.TaxiExppres;


import java.util.Random;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Servicio {
    private int idServicio;
    private Cliente cliente;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Vehiculo vehiculo;
    private int unidadesRecorridas;
    private Empleados conductor;
    private double distancia;
    private double costo;

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }
    public Empleados getConductor() {
        return conductor;
    }

    public void setConductor(Empleados conductor) {
        this.conductor = conductor;
    }
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
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
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = LocalTime.parse(horaInicio);
    }
    public LocalTime getHoraFin() {
        return horaFin;
    }
    public void setHoraFin(String horaFin) {
        this.horaFin = LocalTime.parse(horaFin);
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
        costo = unidadesRecorridas*126;
    }

    public void inicioViaje(){
        if(vehiculo.tanqueVacio() == true){
            System.out.println("El vehiculo escogido no tiene un problema, pida de nuevo el vehiculo");
            vehiculo.tankear(costo);
        }else{
            Random random = new Random();
            String horas = Integer.toString(random.nextInt(24));
            String minutos = Integer.toString(random.nextInt(60));
            if(minutos.length() == 1){
                minutos = "0"+minutos;
            }
            horaInicio= LocalTime.parse(horas+":"+minutos,DateTimeFormatter.ofPattern("H:mm"));
            finalizarViaje();
        }
    }

    public void finalizarViaje(){
        Random random = new Random();
        String horas2 = Integer.toString(random.nextInt(24));
        String minutos2 = Integer.toString(random.nextInt(60));
        if(minutos2.length() == 1){
            minutos2 = "0"+minutos2;
        }
        unidadesRecorridas = random.nextInt(300-50+1)+50;
        horaFin = LocalTime.parse(horas2+":"+minutos2,DateTimeFormatter.ofPattern("H:mm"));
        distancia = unidadesRecorridas*3.5;
        costo = unidadesRecorridas*126;
        
        //vehiculo.GastoGasolina(distancia);
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "idServicio=" + idServicio +
                ", cliente=" + cliente +
                ", fecha=" + fecha +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", vehiculo=" + vehiculo +
                ", unidadesRecorridas=" + unidadesRecorridas +
                ", conductor=" + conductor +
                ", distancia=" + distancia +
                ", costo=" + costo +
                '}';
    }
}
