package com.TaxiExppres;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {
    private String Name;
    private String lastName;
    private int cedula;
    private String correo;
    private String password;
    private Boolean isLogin = false;

    //metodos set/gets
    public Boolean getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Boolean isLogin) {
        this.isLogin = isLogin;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
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
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@(gmail|hotmail|yahoo|outlook)\\.(com|co|gov)$",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(correo);
        if(matcher.matches()){
            this.correo = correo;
        }
        else{
            System.out.println("Formato de correo incorrecto");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
