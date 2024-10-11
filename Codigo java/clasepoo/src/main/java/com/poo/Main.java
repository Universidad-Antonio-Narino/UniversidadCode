package com.poo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String email = "usuariogmail.com";
        
        // Expresión regular corregida
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[gmail|hotmail|yahoo|outlook]+\\.[com]{3}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        
        if (matcher.matches()) {
            System.out.println("El correo es válido.");
        } else {
            System.out.println("El correo es inválido.");
        }
    }
}