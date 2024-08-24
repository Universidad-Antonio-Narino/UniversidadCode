/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase;

/**
 *
 * @Yo Santiago Angel
 */
public class Array {

    /**
     * @Definiendo y declarando arrays
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        //DECLARACION DE ARRAYS
        int[] Edades = new int[8];
        Edades[0] = 5;
        Edades[1] = 25;
        Edades[2] = 52;
        Edades[3] = 51;
        Edades[4] = 56;
        Edades[5] = 45;
        Edades[6] = 52;
        Edades[7] = 35;
        System.out.println(Edades[4]);
        
        //Ver el tamaño del arreglo
        System.out.println(Edades.length);
        
        //Arrays de stirngs
        String[] personas = new String[]{"Gardenas","Joshep Stalin","hola mundo","Yo"};
        for(int pos = 0;pos<personas.length;pos++){
            System.out.println("La posicion es: "+pos+" el dato en esa posicion es: "+personas[pos]);
        }
        int menor = Edades[0];
        int mayor =  Edades[0];
        for(int pos = 0;pos<Edades.length;pos++){
            System.out.println("La posicion es: "+pos+" el dato en esa posicion es: "+Edades[pos]);
            if(Edades[pos]<=menor){
                menor = Edades[pos];   
            }
            if(Edades[pos]>=mayor){
                mayor = Edades[pos];
            }
        }
        System.out.println("La edad minima es: "+menor+"\n La edad maxima es: "+mayor);
        /*Mostrar quie es el mas joven*/
    }
    
}
