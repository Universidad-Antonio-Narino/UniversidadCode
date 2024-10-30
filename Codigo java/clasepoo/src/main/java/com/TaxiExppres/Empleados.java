package com.TaxiExppres;

public class Empleados {
    private int idConductor;
    private String nombreConductor;
    private String apellidoConducto;
    private String licencia;
    private int cedula;
    private int salario;
    private Servicio[] servicios;
    private boolean estado =true;

    
    //encapsulamiento
    public Servicio[] getServicios() {
        return servicios;
    }

    public void setServicios(Servicio[] servicios) {
        this.servicios = servicios;
    }
    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getApellidoConducto() {
        return apellidoConducto;
    }

    public void setApellidoConducto(String apellidoConducto) {
        this.apellidoConducto = apellidoConducto;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Empleados{" +
                "idConductor=" + idConductor +
                ", nombreConductor='" + nombreConductor + '\'' +
                ", apellidoConducto='" + apellidoConducto + '\'' +
                ", licencia='" + licencia + '\'' +
                ", cedula=" + cedula +
                ", salario=" + salario +
                ", estado=" + estado +
                '}';
    }

}
