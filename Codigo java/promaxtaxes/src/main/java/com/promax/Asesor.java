package com.promax;

import java.util.HashMap;
import java.util.Map;

public class Asesor {
    private String name;
    private int cedula;
    private int codigo;
    private Cliente cliente;
    private SolicitudCredito credito;
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public void SolicitudDatos(){
        //llenar
    }
}
