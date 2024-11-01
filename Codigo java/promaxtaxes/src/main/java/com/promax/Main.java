package com.promax;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void timeSleep(String[] respuestasAsesorEspera) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            try {
                // Prefiero el sleep depython
                Thread.sleep(2000);
                int posicionContestadora = random.nextInt(respuestasAsesorEspera.length);
                System.out.println(respuestasAsesorEspera[posicionContestadora]);

            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        // respuestas lobby de espera
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
        // valor de referencia de una dba
        Cliente[] clienteRegister = new Cliente[2];
        Asesor asesor = new Asesor();
        asesor.setName("Pedro meneses");
        asesor.setCedula(1001);
        asesor.setCodigo(123445678);

        Banco banco = new Banco();

        // llenado banco
        banco.setBankName("Ahorro Promax");

        int idRegistro = 0;
        Scanner keyword = new Scanner(System.in);
        System.out.println("Bienvenido a el banco promax...");
        boolean condition = true;
        while (condition) {
            Producto producto = new Producto();
            Cliente ClienteOperator = new Cliente();
            SolicitudCredito solicitudCreditoCliente = new SolicitudCredito();

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
                    // try {
                    System.out.println("Bienvenido a el banco promax señor/a " + clienteLogueado.getName() + " "
                            + clienteLogueado.getLastName());
                    boolean opcionMenuBanco = true;
                    while (opcionMenuBanco) {
                        System.out.println(
                                "Menu: \n\t 1) Solicitar credito \n\t 2) Verificar Saldo cuenta \n\t 4) Sacar dinero \n\t 5) Consignar dinero \n\t 6) Informacion deuda credito \n\t 7) cerrarSesion");
                        int opcionMenu = keyword.nextInt();
                        switch (opcionMenu) {
                            case 1:
                                System.out.println("Espere un momento a que un asesor se conecte...");
                                timeSleep(respuestasAsesorEspera);
                                System.out.println("Lo atiende su asesor " + asesor.getName()
                                        + " mi con codigo de empleado " + asesor.getCodigo());
                                System.out.println(
                                        "Para poder hacer efectivo el credito necesitamos algunos datos referentes al mismo: \n\r Cules son sus ingresos mensuales: ");
                                Double ingresos = keyword.nextDouble();
                                solicitudCreditoCliente.setIngresos(ingresos);
                                ;
                                System.out.println("Monto del credito: ");
                                int monto = keyword.nextInt();
                                solicitudCreditoCliente.setMonto(monto);
                                System.out.println(
                                        "Ingrese el tipo de credito que desea solicitar, los creditos validos son  \n\t 1) Vivienda \n\t 2) Vehiculo \n\t 3) Libre comercio \n\t 4) Salir \n Elija una opccion: ");
                                int tipoCredito = keyword.nextInt();
                                double gastosCliente;
                                int cuotasCliente;
                                switch (tipoCredito) {
                                    case 1:

                                        producto.setTipoCredito("Vivienda");
                                        producto.setTasas(0.012);
                                        producto.setTiempo(20);
                                        solicitudCreditoCliente.setTipoCredito(producto);
                                        System.out.println("Ingrese un aproximado de gastos mensuales: ");
                                        gastosCliente = keyword.nextDouble();
                                        solicitudCreditoCliente.setGastos(gastosCliente);
                                        System.out.println("Ingrese las cuotas de pago de su credito ");
                                        cuotasCliente = keyword.nextInt();
                                        solicitudCreditoCliente.setCuota(cuotasCliente);
                                        solicitudCreditoCliente.setCapacidadPago();
                                        clienteLogueado.setCreditoCliente(solicitudCreditoCliente);
                                        System.out.println(
                                                "Su informacion esta siendo cargada al banco, en unos momentos obtendra su respuesta de aprobacion o negacion de credito");
                                        timeSleep(respuestasAsesorEspera);
                                        banco.calcularAdaptabilidad(clienteLogueado);
                                        clienteLogueado.setDeuda(
                                                (clienteLogueado.getCreditoCliente().getCuotaFijaMensual()
                                                        + clienteLogueado.getCreditoCliente().getGastos()));

                                        Cliente[] datosLLenosNewClienteVivienda = asesor.SolicitudDatos(clienteRegister,
                                                clienteLogueado);
                                        clienteRegister = datosLLenosNewClienteVivienda;
                                        for (Cliente cliente : clienteRegister) {
                                            System.out.println(cliente);
                                        }

                                        break;
                                    case 2:

                                        producto.setTipoCredito("Vehiculo");
                                        producto.setTasas(0.02);
                                        producto.setTiempo(5);
                                        solicitudCreditoCliente.setTipoCredito(producto);
                                        System.out.println("Ingrese un aproximado de gastos mensuales: ");
                                        gastosCliente = keyword.nextDouble();
                                        solicitudCreditoCliente.setGastos(gastosCliente);
                                        System.out.println("Ingrese las cuotas de pago de su credito ");
                                        cuotasCliente = keyword.nextInt();
                                        solicitudCreditoCliente.setCuota(cuotasCliente);
                                        solicitudCreditoCliente.setCapacidadPago();
                                        clienteLogueado.setCreditoCliente(solicitudCreditoCliente);
                                        System.out.println(
                                                "Su informacion esta siendo cargada al banco, en unos momentos obtendra su respuesta de aprobacion o negacion de credito");
                                        timeSleep(respuestasAsesorEspera);
                                        banco.calcularAdaptabilidad(clienteLogueado);
                                        clienteLogueado.setDeuda(
                                                (clienteLogueado.getCreditoCliente().getCuotaFijaMensual()
                                                        + clienteLogueado.getCreditoCliente().getGastos()));
                                        Cliente[] datosLLenosNewClienteVehiculo = asesor.SolicitudDatos(clienteRegister,
                                                clienteLogueado);
                                        clienteRegister = datosLLenosNewClienteVehiculo;
                                        for (Cliente cliente : clienteRegister) {
                                            System.out.println(cliente);
                                        }

                                        break;
                                    case 3:

                                        producto.setTipoCredito("Libre comercio");
                                        producto.setTasas(0.05);
                                        producto.setTiempo(3);
                                        solicitudCreditoCliente.setTipoCredito(producto);
                                        System.out.println("Ingrese un aproximado de gastos mensuales: ");
                                        gastosCliente = keyword.nextDouble();
                                        solicitudCreditoCliente.setGastos(gastosCliente);
                                        System.out.println("Ingrese las cuotas de pago de su credito ");
                                        cuotasCliente = keyword.nextInt();
                                        solicitudCreditoCliente.setCuota(cuotasCliente);
                                        solicitudCreditoCliente.setCapacidadPago();
                                        clienteLogueado.setCreditoCliente(solicitudCreditoCliente);
                                        System.out.println(
                                                "Su informacion esta siendo cargada al banco, en unos momentos obtendra su respuesta de aprobacion o negacion de credito");
                                        timeSleep(respuestasAsesorEspera);
                                        banco.calcularAdaptabilidad(clienteLogueado);
                                        clienteLogueado.setDeuda(
                                                (clienteLogueado.getCreditoCliente().getCuotaFijaMensual()
                                                        + clienteLogueado.getCreditoCliente().getGastos()));

                                        Cliente[] datosLLenosNewClienteLibreComercio = asesor.SolicitudDatos(
                                                clienteRegister,
                                                clienteLogueado);
                                        clienteRegister = datosLLenosNewClienteLibreComercio;
                                        for (Cliente cliente : clienteRegister) {
                                            System.out.println(cliente);
                                        }

                                        break;
                                    case 4:
                                        break;
                                    default:
                                        break;
                                }

                                break;
                            case 2:
                                // es un plus, esto no se pide en el spring del parcial
                                break;
                            case 3:
                                // es un plus, esto no se pide en el spring del parcial
                                break;
                            case 4:
                                // es un plus, esto no se pide en el spring del parcial
                                break;
                            case 5:
                                // es un plus, esto no se pide en el spring del parcial
                                break;
                            case 6:
                                // es un plus, esto no se pide en el spring del parcial
                                break;
                            case 7:
                                clienteLogueado.setLogueado(false);
                                opcionMenuBanco = false;
                                break;
                            default:
                                break;
                        }
                    }
                    /*
                     * 
                     * } catch (Exception e) {
                     * System.out.println("Cliente no encontrado, o credenciales incorrectas");
                     * System.out.println(e);
                     * }
                     */

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
