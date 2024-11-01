package com.promax;

import java.util.Scanner;
public class Asesor {
    private String name;
    private int cedula;
    private int codigo;
    private Cliente[] cliente;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public Cliente[] SolicitudDatos(Cliente[] cliente,Cliente datosCliente){
        System.out.println("Solicitud Completada: ");
        setCliente(cliente);
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i] == datosCliente){
                cliente[i] = datosCliente;
            }
        }
        return cliente;
    }
}
