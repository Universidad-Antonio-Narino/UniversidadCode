package com.promax;

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //respuestas lobby de espera
        String[] respuestasAsesorEspera = {
            "Gracias por su paciencia. En unos momentos lo atenderemos.",
            "Estamos trabajando en su solicitud, por favor espere unos instantes.",
            "Un asesor se comunicará con usted en breve, gracias por su espera.",
            "Su consulta es importante para nosotros. Enseguida estaremos con usted.",
            "Estamos aquí para ayudarle. Espere un momento mientras procesamos su solicitud.",
            "Apreciamos su tiempo, pronto será atendido.",
            "Nos estamos asegurando de brindarle el mejor servicio. Gracias por esperar.",
            "En Ahorro Promax, su futuro está asegurado.",
            "Ahorro Promax, el banco que crece con usted.",
            "Confíe en Ahorro Promax, construimos su camino hacia el éxito.",
            "El banco que entiende sus metas: Ahorro Promax.",
            "Con Ahorro Promax, sus ahorros trabajan para usted.",
            "Invierte en tranquilidad. Ahorro Promax, la elección inteligente.",
            "Ahorro Promax, siempre a su lado para cumplir sus sueños financieros."
        };
        //valor de referencia de una dba
        Cliente[] clienteRegister = new Cliente[2];
        int idRegistro = 0;
        Asesor asesor = new Asesor();

        Scanner keyword = new Scanner(System.in);
        System.out.println("Bienvenido a el banco promax...");
        boolean condition = true;
        while (condition) {
            Cliente ClienteOperator = new Cliente();
            System.out.println("Escoja cualquiera de las opciones: ");
            System.out.println("\n\t 1) Registrarse \n\t 2) loguearse \n\t 3) Salir");
            int opcion = keyword.nextInt();
            switch (opcion) {
                case 1:
                    Cliente clienteNuevo = ClienteOperator.Register(clienteRegister);
                    clienteRegister[idRegistro] = clienteNuevo;
                    idRegistro++;
                    break;
                case 2:
                    Cliente clienteLogueado = ClienteOperator.login(clienteRegister);
                    if (clienteLogueado!=null) { 
                        System.out.println("Bienvenido a el banco promax señor/a "+clienteLogueado.getName()+" "+clienteLogueado.getLastName());
                        System.out.println("\n");
                        boolean opcionMenuBanco = true;
                        while (opcionMenuBanco) {
                            System.out.println("Menu: \n\t 1) Solicitar credito \n\t 2) Verificar Saldo cuenta \n\t 4) Sacar dinero \n\t 5) Consignar dinero \n\t 6) Informacion deuda credito \n\t 7) Salir");
                            int opcionMenu = keyword.nextInt();
                            switch (opcionMenu) {
                                case 1:
                                    System.out.println("Espere un momento a que un asesor se conecte...");
                                    Random random = new Random();
                                    for (int i = 0; i < 5; i++) {
                                        try {
                                            //Prefiero el sleep depython
                                            Thread.sleep(2000);
                                            int posicionContestadora = random.nextInt(respuestasAsesorEspera.length);
                                            System.out.println(respuestasAsesorEspera[posicionContestadora]);
                                            
                                        } catch (InterruptedException e) {
                                           break;
                                        }
                                    }
                                    System.out.println("Lo atiende su asesor Pedro meneses");
                                    System.out.println("Para poder hacer efectivo el credito necesitamos algunos datos referentes al mismo: \n\r Cules son sus ingresos mensuales: ");
                                    Double ingresos = keyword.nextDouble();
                                    clienteLogueado.getCredito().setIngresos(ingresos);
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    break;
                                case 7:
                                    opcionMenuBanco = false;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }else{
                        System.out.println("Credenciales incorrectas");
                    }
                    break;
                case 3:
                    condition = false;
                    break;
                default:
                    break;
            }
        }
    }
}
