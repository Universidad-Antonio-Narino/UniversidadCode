package com.promax;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Cliente {
    private String name;
    private String lastName;
    private int cedula;
    private String correo;
    private String password;
    private SolicitudCredito credito;
    private boolean logueado = false;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        Scanner keyword = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@(gmail|hotmail|yahoo|outlook)\\.(com|co|gov)$",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(correo);
        if (matcher.matches()) {
            this.correo = correo;
        } else {
            System.out.println("Formato de correo incorrecto");
            while (getCorreo() == null) {
                System.out.println("Ingrese su Email: ");
                correo = keyword.nextLine();
                setCorreo(correo);
            }
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogueado() {
        return logueado;
    }

    public void setLogueado(boolean logueado) {
        this.logueado = logueado;
    }

    public SolicitudCredito getCredito() {
        return credito;
    }

    public void setCredito(SolicitudCredito credito) {
        this.credito = credito;
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

    public Cliente login(Cliente[] registrado) {
        Cliente clienteResulta = new Cliente();

        Scanner keyword = new Scanner(System.in);
        System.out.println("Ingrese su correo: ");
        String correoLoguin = keyword.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String passwordLoguin = keyword.nextLine();
        for (Cliente clienteRegistrado : registrado) {
                try {
                    if (correoLoguin.equals(clienteRegistrado.getCorreo())){
                        if (passwordLoguin.equals(clienteRegistrado.getPassword())) {
                            clienteRegistrado.setLogueado(true);
                            clienteResulta = clienteRegistrado;
                        }else
                        clienteResulta = null;
                    }
                } catch (NullPointerException e) {
                    break;
                }
            }
            return clienteResulta;
    }
    

    public Cliente Register(Cliente[] registrado) {
        // agregamos cliente de manera dinamica porque el array list es red flag
        Scanner keyword = new Scanner(System.in);
        Cliente clienteNuevoRegistro = new Cliente();

        System.out.println("Ingrese su nombre: ");
        String name = keyword.nextLine();
        clienteNuevoRegistro.setName(name);

        System.out.println("Ingrese su apellido: ");
        String lastName = keyword.nextLine();
        clienteNuevoRegistro.setLastName(lastName);

        System.out.println("Ingrese su Cedula: ");
        int cedula = keyword.nextInt();
        clienteNuevoRegistro.setCedula(cedula);
        keyword.nextLine();

        System.out.println("Ingrese su correo: ");
        String correo = keyword.nextLine();
        clienteNuevoRegistro.setCorreo(correo);

        System.out.println("Ingrese su contraseña: ");
        String password = keyword.nextLine();
        clienteNuevoRegistro.setPassword(password);

        // Agrega el nuevo cliente en la última posición del nuevo arreglo

        return clienteNuevoRegistro;
    }
    
    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cedula=" + cedula +
                ", correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                ", credito=" + credito +
                ", logueado=" + logueado +
                '}';
    }
}
