package com.poojava;

public class Main {
    static class Persona
    {
        protected String nombre; //atributos 
        protected int edad; //atributos
        public Persona (String nombre, int edad)// cosntructor de clase o inicializador de clase
        {
            this.nombre=nombre; // apuntador como self en python
            this.edad=edad;
        }
        public void mostrar()
        {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
        }
    }
    
    static class Alumno extends Persona
    {
        private float notaFinal;
        public Alumno(String nombre, int edad, float notaFinal)
        {
            super(nombre,edad);
            this.notaFinal=notaFinal;
        }
        public void mostrar()
        {
            super.mostrar();
            System.out.println("Nota Final: "+ notaFinal);
        }
    }
    
    static class Profesor extends Persona //extends es la forma de herencia en java
    {
        private String materia;
        public Profesor(String nombre, int edad, String materia)
        {
            super(nombre,edad);
            this.materia=materia;
        }
        public void mostrar()
        {
            super.mostrar();
            System.out.println("Materia: "+ materia);
        }
    }
    
    public static void main(String[] args)
    {
        Persona[] lista1 = new Persona[3];
        lista1[0] = new Profesor("Juan",30,"Lógica");
        lista1[1] = new Alumno("Pedro",19,2.9f);
        lista1[2] = new Alumno("Maria",21,4.9f);
        
        for (Persona p : lista1)
        {
            if ( p instanceof Alumno)
            {
                Alumno a = (Alumno) p;
                if(a.notaFinal<3)
                    a.mostrar();    
            }
            
        }
        

        
        
    }
}

    