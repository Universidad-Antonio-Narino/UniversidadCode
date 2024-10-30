package com.TaxiExppres;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.aspose.barcode.internal.ex.so;

public class Main {
    public static void main(String[] args) {
        Scanner keyword = new Scanner(System.in);
        Random random = new Random();

        Plataforma app = new Plataforma();
        System.out.println("En estos momentos usted esta en modo administrador: ");
        System.out.println("Cuantos carros va comprar: ");
        int numVehiculos = keyword.nextInt();
        System.out.println("Registre los vehiculos que trabajaran en su empresa: ");

        Vehiculo[] vehiculo = new Vehiculo[numVehiculos];

        for (int i = 0; i < numVehiculos; i++) {
            System.out.println("Carga de datos conducor #" + (i + 1) + ": ");
            vehiculo[i] = new Vehiculo();
            keyword.nextLine();
            System.out.println("Marca: ");
            String marca = keyword.nextLine();
            System.out.println("Modelo: ");
            String modelo = keyword.nextLine();
            System.out.println("Placa: ");
            String placa = keyword.nextLine();
            System.out.println();

            System.out.println("Ahora pueden ingresar los conductores: ");
            Empleados empleado = new Empleados();
            empleado.setIdConductor(i);
            System.out.println("Ingrese el nombre del conductor: ");
            String name = keyword.nextLine();
            System.out.println("Ingrese el apellido del conductor: ");
            String apellidoConductor = keyword.nextLine();
            System.out.println("Ingrese la licencia del conductor: ");
            String licencia = keyword.nextLine();
            System.out.println("Ingrese la cedula del conductor: ");
            int cedula = keyword.nextInt();

            // llenando los datos vehiculo
            vehiculo[i].setMarca(marca);
            vehiculo[i].setModelo(modelo);
            vehiculo[i].setPlaca(placa);
            vehiculo[i].setCapacidadCombustible();

            // llenando datos cliente
            empleado.setIdConductor(i + 1);
            empleado.setNombreConductor(name);
            empleado.setApellidoConducto(apellidoConductor);
            empleado.setLicencia(licencia);
            empleado.setCedula(cedula);
            vehiculo[i].setConductor(empleado);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("\n");
        }
        System.out.println("AHORA ESTA EN MODO USUARIO");

        int opcion = 0;
        do {
            System.out.println("opciones: \t\n 1) Registrarse \t\n 2) Iniciar Sesion \t\n 3) salir");
            opcion = keyword.nextInt();
            switch (opcion) {
                case 1:
                    keyword.nextLine();
                    app.registrarse();
                    break;
                case 2:
                    Cliente clienteLogueado = app.login();
                    // ingreso a la aplicacion y toma del servicio
                    int numServicios = 1;
                    boolean opcionSer = true;
                    ArrayList<Servicio> servicios = new ArrayList<>();
                    while (opcionSer) {

                        System.out.println("Desea tomar taxi?: \n\t 1) Si \n\t 2) Salir");
                        int opcionTaxi = keyword.nextInt();
                        ArrayList<Factura> facturas = new ArrayList<>();
                        switch (opcionTaxi) {
                            case 1:
                                Servicio servicio = new Servicio();
                                servicio.setIdServicio(numServicios);
                                servicio.setCliente(clienteLogueado);
                                servicio.setFecha(LocalDate.now());
                                numServicios += 1;

                                Vehiculo vehiculoEscogido = vehiculo[random.nextInt(vehiculo.length)];
                                servicio.setVehiculo(vehiculoEscogido);
                                servicio.setConductor(vehiculoEscogido.getConductor());
                                servicios.add(servicio);
                                System.out.println("Su vehiculo ya ha llegado a su ubicacion desea continuar el viaje? \t\n 1) Si \t\n 2) No");
                                int opcionInicioViaje = keyword.nextInt();
                                Factura factura = new Factura();
                                if (opcionInicioViaje == 1) {
                                    if (servicio.getVehiculo().tanqueVacio()) {
                                        servicio.inicioViaje();
                                    }
                                    else{
                                        servicio.inicioViaje();
                                        factura.setCliente(clienteLogueado);
                                        factura.setVehiculo(vehiculoEscogido);
                                        factura.setDetalleVenta(servicios.toArray(new Servicio[0]));
                                        factura.generarFactura();
                                    }
                                }
                                break;
                            case 2:
                                opcionSer = false;
                                break;
                            default:
                                break;
                        }
                    }
                    for (Servicio servicio : servicios) {
                        System.out.println(servicio);
                    }
                    break;
                    case 3:
                default:
                    break;
            }
        } while (opcion != 3);
    }
}
