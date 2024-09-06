package com.exampoo;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class BancoBbc {
    public static void main(String[] args) {
        /*
         * Primero debo crear la interfaz de usuario
         * El cual debe contener registrar clientes 
         * consultar clientes cerrar sesion: esto es nada mas
         * para asesores el menu de asesores
         * Inicio de sesion
         * consulta de saldo de cuenta 
         * realizar retiro 
         * realizar consignacion
         * cerrar sesion
         * 
         * 
         * 
         * Para la simulacion de dba no podre utilizar diccionarios
         * que es lo mejor para esto, pero por el contrario utilizare listas donde todos sus datos sean strings y ya hago comparaciones 
         * Para eso voy a utilizar matrices
         */
        Random randomCuenta = new Random();
        String[][] UsuariosCliente = new String[10][8];
        String EmailAdmin = "adminBBC@bbc.com.co";
        String PasswordAdmin = "123456Admin";
        Boolean numIter = true;
        // Entrada de dos tipos asesor o cliente o para el caso de terminar el programa salir
        String inputAccount = "";
        int numClient = 0;
        // while que permite que el programa se siga ejecutando
        do{
            System.out.println("Ingrese el perfil con el que desea acceder: ");
            Scanner input = new Scanner(System.in); 
            inputAccount = input.nextLine();
            switch (inputAccount.toUpperCase()){
                case "ASESOR":
                    System.out.println("Ingrese sus credenciales, primero su email y luego su password: ");
                    String email = input.nextLine();
                    String password = input.nextLine();
                    if (email.equals(EmailAdmin) && password.equals(PasswordAdmin)) {
                        System.out.println("acceso al sistema");
                        String menu = """
                                Menu del sistema:
                                1) Registrar clientas
                                2) Consultar clientes
                                3) Consultar Saldo Cliente
                                4) Cerrar sesion
                                """;
                                System.out.println(menu);
                                Integer opcionMenuAsesor = input.nextInt();
                                switch (opcionMenuAsesor) {
                                    case 1:
                                        numClient++;
                                        /* 
                                         *  1 posicion = nombre
                                            2 posicion = apellido 
                                            3 posicion = cedula
                                            4 posicion = correo
                                            5 posicion = celular
                                            6 posicion = contraseña
                                            7 posicion = cuenta de ahorros 
                                            8 posicion = saldo
                                        */
                                        System.out.println("Ingrese su nombre: ");
                                        UsuariosCliente[numClient-1][0] = input.nextLine();
                                        input.nextLine();
                                        System.out.println("Ingrese su apellido: ");
                                        UsuariosCliente[numClient-1][1] = input.nextLine();
                                        System.out.println("Ingrese su cedula: ");
                                        UsuariosCliente[numClient-1][2] = input.nextLine();
                                        System.out.println("Ingrese su correo: ");
                                        UsuariosCliente[numClient-1][3] = input.nextLine();
                                        System.out.println("Ingrese su celular: ");
                                        UsuariosCliente[numClient-1][4] = input.nextLine();
                                        String passwordClient = "";
                                        do{
                                            System.out.println("Ingrese su contraseña: ");
                                            passwordClient = input.nextLine();
                                        }while(passwordClient.contains("0") && passwordClient.length() == 3);
                                        UsuariosCliente[numClient-1][5] = passwordClient;
                                        String lastNumbersCard = "";
                                        for(int i = 0;i<3;i++){
                                            lastNumbersCard+= String.valueOf(ThreadLocalRandom.current().nextInt(1, 100));
                                        }
                                        UsuariosCliente[numClient-1][6] = "2021"+UsuariosCliente[numClient-1][2]+lastNumbersCard;
                                        UsuariosCliente[numClient-1][7] = "1000000";
                                        //verificacion de datos unicos
                                        for (int i = 0; i < UsuariosCliente.length; i++) {
                                            
                                        }
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        break;
                                }
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.println(UsuariosCliente[i][j]);
                        }
                    }        

                    } else {
                        System.out.println((!email.equals(EmailAdmin)) ? "Email incorrecto" : "Password incorrecta");
                    }
                break;
                case "CLIENTE":
                    
                break;
                case "SALIR":
                    numIter=false;
                    break;
                default:
                    System.out.println("Tipo de usuario incorrecto");
                break;
            }
        }while (numIter);
    }
}