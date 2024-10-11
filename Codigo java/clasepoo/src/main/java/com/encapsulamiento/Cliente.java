
package com.encapsulamiento;


public class Cliente {
    
    private String nombre;
    
    private String apellido;
    
    private int cedula;
    
    private String correo;
    
    
    /*
     * Luego de colocar privados los atributos de la clase
     * Se debe construir una forma de acceder a estos
     * Se construye un método para acceder a cada atributo
     * 
     */
    
    /**
     * Los métodos son declarados por la siguiente estructura
     * Estos métodos se asemejan a las funciones de otros lenguajes
     * Puedo tener aca varias lineas de código que realicen alguna operación
     * @return 
     */
        public String getFirmaAgua(){                        
            
            String firma = "Marca de agua - Clase POO 2024";
                        
        return firma;
    }
    
    // Se utilizan los SET => Guarda un valor en cada atributo
        // Este método no devuelve nada
        // Por convención empieza por el prefijo set+nombre atributo
        // Este método recibe un parametro y luego lo asigna al atributo de la clase
    public void setNombre(String nombre){
        
        // Se asigna el valor recibido por parametro al atributo nombre
        this.nombre = nombre;
        // Pueden existir mas código si llega a ser necesario
    }
    
    // Método que recupera el valor del atributo
    public String getNombre(){
        
        return this.nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
