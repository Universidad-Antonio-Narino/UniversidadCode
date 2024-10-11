package com.restaurantpizza;

public class Cliente {
    private String name;
    private String lastName;
    private int cedula;
    private String correo;


    public String getFirmaAgua(){
        String firma = "Maraca de agua - Clase Poo 2024";
        return firma;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
