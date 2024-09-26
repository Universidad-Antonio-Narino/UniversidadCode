package com.pizza;

public class Cliente {
    //private forma parte del encapsulamiento
    private String name;
    private String lastName;
    private int identification;
    private String email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getIdentification(){
        return identification;
    }
    public void setIdentification(int identification){
        this.identification = identification;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

}
