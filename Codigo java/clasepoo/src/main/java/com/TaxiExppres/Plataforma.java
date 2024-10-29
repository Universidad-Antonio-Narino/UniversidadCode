package com.TaxiExppres;

import java.util.ArrayList;
import java.util.Scanner;

public class Plataforma {
    private ArrayList<Cliente>  usuariosRegistrados= new ArrayList<>();
    public int intentos =0;
    public boolean isRegistered = false;

    public ArrayList<Cliente> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    private void setUsuariosRegistrados(Cliente usuarioRegistrado) {
        this.usuariosRegistrados.add(usuarioRegistrado);
    }

    public void registrarse(){
        Scanner keyword = new Scanner(System.in);
        Cliente clienteNuevo = new Cliente();
        System.out.println("Ingrese su nombre: ");
        String name = keyword.nextLine();
        clienteNuevo.setName(name);
        System.out.println("Ingrese su apellido: ");
        String lastName = keyword.nextLine();
        clienteNuevo.setLastName(lastName);
        System.out.println("Ingrese su cedula: ");
        int cedula = keyword.nextInt();
        clienteNuevo.setCedula(cedula);
        keyword.nextLine();
        System.out.println("Ingrese su correo");
        String correo =keyword.nextLine();
        clienteNuevo.setCorreo(correo);
        //verificaciones correo
        while (clienteNuevo.getCorreo() == null){
            System.out.println("Ingrese su Email: ");
            correo = keyword.nextLine();
            clienteNuevo.setCorreo(correo);
        }
        System.out.println("Ingrese su contraseña: ");
        String password = keyword.nextLine();
        clienteNuevo.setPassword(password);

        //lo registro en la plataforma
        setUsuariosRegistrados(clienteNuevo);
    }

    public void login(){
        Scanner keyword = new Scanner(System.in);
        System.out.println("Ingrese su correo: ");
        String correo = keyword.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String password = keyword.nextLine();
        for (Cliente cliente : usuariosRegistrados) {
            if(correo.equals(cliente.getCorreo())){
                if (password.equals(cliente.getPassword())) {
                    isRegistered = true;
                    cliente.setIsLogin(true);
                    System.out.println("Bienvenido al sistema señor/a: "+cliente.getName()+" "+cliente.getLastName());
                }
                else{
                    break;
                }
            }
        }
        while ((!isRegistered) && intentos != 3) {
            intentos+=1;
            System.out.println(intentos);
            System.out.println("Alguno de los datos ingresados son incorrectos, intente de nuevo");
            login();
        }
        if (!isRegistered) {
            System.out.println("Su correo no existe desea registrarse");
            System.out.println("\t\n 1) Si \t\n 2) No");
            int opcion = keyword.nextInt();
            switch (opcion) {
                case 1:
                    registrarse();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}
