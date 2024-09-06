package com.exampoo;

import java.util.*;

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
         * que es lo mejor para esto, pero por el contrario utilizare listas donde todos
         * sus datos sean strings y ya hago comparaciones
         * Para eso voy a utilizar matrices
         * 
         * 1 posicion = nombre
         * 2 posicion = apellido
         * 3 posicion = cedula
         * 4 posicion = correo
         * 5 posicion = celular
         * 6 posicion = contraseña
         * 7 posicion = cuenta de ahorros
         * 8 posicion = saldo
         */

        Random randomCuenta = new Random();
        //String[][] UsuariosCliente = {{ "sam", "angel", "1","sam@","3214","123","20241324","1000000"}}; 
        
        String[][] UsuariosCliente = new String[10][8];
        UsuariosCliente[0][0] = "sam";
        UsuariosCliente[0][1] = "angel";
        UsuariosCliente[0][2] = "1";
        UsuariosCliente[0][3] = "sam@";
        UsuariosCliente[0][4] = "3214";
        UsuariosCliente[0][5] = "123";
        UsuariosCliente[0][6] = "20241324";
        UsuariosCliente[0][7] = "1000000";

        Integer[] numKeyWord = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        String EmailAdmin = "admin";// adminBBC@bbc.com.co email asesor
        String PasswordAdmin = "123";// 123456Admin clave asesor
        //numero de iteraciones que me permitira salir del programa si asi lo solicito
        Boolean numIter = true;
        // Entrada de dos tipos asesor o cliente o para el caso de terminar el programa
        // salir
        String inputAccount = "";
        int numClient = 1;
        // while que permite que el programa se siga ejecutando
        do {
            System.out.println("Ingrese el perfil con el que desea acceder (asesor o cliente o salir): ");
            Scanner input = new Scanner(System.in);
            inputAccount = input.nextLine();
            switch (inputAccount.toUpperCase()) {
                case "ASESOR":
                    System.out.println("Ingrese sus credenciales, primero su email y luego su password: ");
                    String email = input.nextLine();
                    String password = input.nextLine();
                    if (email.equals(EmailAdmin) && password.equals(PasswordAdmin)) {
                        String logout = "active";
                        while (logout != "Nactive") {

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
                                     * 1 posicion = nombre
                                     * 2 posicion = apellido
                                     * 3 posicion = cedula
                                     * 4 posicion = correo
                                     * 5 posicion = celular
                                     * 6 posicion = contraseña
                                     * 7 posicion = cuenta de ahorros
                                     * 8 posicion = saldo
                                     */

                                    System.out.println("Ingrese su nombre: ");
                                    UsuariosCliente[numClient - 1][0] = input.nextLine();
                                    input.nextLine();
                                    System.out.println("Ingrese su apellido: ");
                                    UsuariosCliente[numClient - 1][1] = input.nextLine();
                                    System.out.println("Ingrese su cedula: ");
                                    UsuariosCliente[numClient - 1][2] = input.nextLine();
                                    System.out.println("Ingrese su correo: ");
                                    UsuariosCliente[numClient - 1][3] = input.nextLine();
                                    System.out.println("Ingrese su celular: ");
                                    UsuariosCliente[numClient - 1][4] = input.nextLine();
                                    String passwordClient = "";
                                    do {
                                        System.out.println("Ingrese su contraseña: ");
                                        passwordClient = input.nextLine();
                                    } while (passwordClient.contains("0") && passwordClient.length() == 3);
                                    UsuariosCliente[numClient - 1][5] = passwordClient;
                                    String lastNumbersCard = "";
                                    for (int i = 0; i < 3; i++) {
                                        lastNumbersCard += String.valueOf(randomCuenta.nextInt(10));
                                    }
                                    UsuariosCliente[numClient - 1][6] = "2021" + UsuariosCliente[numClient - 1][2]
                                            + lastNumbersCard;
                                    UsuariosCliente[numClient - 1][7] = "1000000";
                                    break;
                                case 2:
                                    System.out.println("Ingrese el numero de cedula del cliente que desea consultar: ");
                                    int cedula = input.nextInt();
                                    for (int number = 0; number < UsuariosCliente.length; number++) {
                                        if (Integer.toString(cedula).equals(UsuariosCliente[number][2])) {
                                            for (String infoClient : UsuariosCliente[number]) {
                                                System.out.println(infoClient);
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("Ingrese el numero de cedula del cliente que desea consultar: ");
                                    int cedulaV = input.nextInt();
                                    for (int number = 0; number < UsuariosCliente.length; number++) {
                                        if (Integer.toString(cedulaV).equals(UsuariosCliente[number][2])) {
                                            System.out.println("Saldo cliente " + UsuariosCliente[number][1] + " es: "
                                                    + UsuariosCliente[number][7]);
                                        }
                                    }
                                    break;
                                case 4:
                                    logout = "Nactive";
                                    break;
                                default:
                                    System.out.println("Opcion invalida");
                                    break;
                            }
                        }

                    } else {
                        System.out.println((!email.equals(EmailAdmin)) ? "Email incorrecto" : "Password incorrecta");
                    }
                    break;
                case "CLIENTE":
                    boolean verifiPassEmail = true;
                    //piense que es un token de acceso
                    int posicionInfo = 0;
                    do {
                        System.out.println("Ingrese sus credenciales correo y contraseña");
                        String emailClient = input.nextLine();
                        for (int i = 0; i < 9; i++) {
                            int indexDigit = randomCuenta.nextInt(numKeyWord.length);
                            int intercambioTemporal = numKeyWord[i];
                            numKeyWord[i] = numKeyWord[indexDigit];
                            numKeyWord[indexDigit] = intercambioTemporal;
                        }
                        String passwordClient = "";
                        System.out.println("Ingrese la posicion, segun el orden, ejemplo");
                        String ejemplo = """
                                * se ingresa la posicion
                                   1
                                * |2| |1| |4|

                                * |3| |7| |9|
                                   7       9
                                * |5| |8| |6|
                                * si su contraseña es -> 265
                                * ustede debe teclearlo asi
                                * 1
                                * 9
                                * 7
                                """;
                        for (int i = 1; i < numKeyWord.length; i += 3) {
                            String screenKeyword = "";
                            for (int j = i; j < i + 3; j++) {
                                screenKeyword += "|" + numKeyWord[j - 1] + "|";
                            }
                            System.out.println(screenKeyword);
                        }
                        System.out.println(ejemplo);
                        for (int i = 0; i < 3; i++) {
                            int digit = input.nextInt();
                            passwordClient += Integer.toString(numKeyWord[digit - 1]);
                        }

                        for (int i = 0; i < 10; i++) {
                            if (emailClient.equals(UsuariosCliente[i][3])
                                    && passwordClient.equals(UsuariosCliente[i][5])) {
                                verifiPassEmail = false;
                                posicionInfo = i;
                                break;
                            }
                            else{
                                System.out.println("Datos Invalidos");
                            }
                        }
                    } while (verifiPassEmail);
                    //ya verifico email
                    //menu cliente
                    String logout = "active";
                    while (logout != "Nactive"){

                        System.out.println("Bienvenido "+UsuariosCliente[posicionInfo][1]);
                        String menu = """
                            Menu:
                            1) Consultar Saldo
                            2) Realizar Retiro
                            3) Realizar Consignacion
                            4) Cerrar Sesion
                            """;
                            System.out.println(menu);
                            int opcionClient =input.nextInt();
                            switch (opcionClient) {
                                case 1:
                                    System.out.println("Su saldo es: "+UsuariosCliente[posicionInfo][7]);
                                break;
                                case 2:
                                    int saldoRetiro = Integer.parseInt(UsuariosCliente[posicionInfo][7]);
                                    int CantidadRetirar = 0;
                                    do {
                                        System.out.println("Cuanto dinero desea retirar: ");
                                        CantidadRetirar = input.nextInt();
                                        if(saldoRetiro<CantidadRetirar){
                                            System.out.println("Fondos insuficientes");
                                        }
                                    }while((saldoRetiro-CantidadRetirar)<0);
                                    saldoRetiro = saldoRetiro-CantidadRetirar;
                                    UsuariosCliente[posicionInfo][7] = String.valueOf(saldoRetiro);
                                break;
                                case 3:
                                    int saldoConsi = Integer.parseInt(UsuariosCliente[posicionInfo][7]);
                                    int CantidadConsignar = 10000;
                                    do {
                                        System.out.println("Cuanto dinero desea consignar: ");
                                        CantidadConsignar = input.nextInt();
                                        if (CantidadConsignar%10 != 0 && !(CantidadConsignar>=10000)) {
                                            System.out.println("Solo puede consignar en multiplos de 10 y mayores a 10000");
                                        }
                                    }while(CantidadConsignar%10 != 0 && !(CantidadConsignar>=10000));
                                    saldoConsi = saldoConsi+CantidadConsignar;
                                    UsuariosCliente[posicionInfo][7] = String.valueOf(saldoConsi);
                                break;
                                case 4:
                                    logout = "Nactive";
                                break;
                                default:
                                    System.out.println("Opcion invalida");
                                break;
                            }
                    }
                    break;

                case "SALIR":
                    numIter = false;
                    break;
                default:
                    System.out.println("Tipo de usuario incorrecto");
                    break;
            }
        } while (numIter);
    }
}