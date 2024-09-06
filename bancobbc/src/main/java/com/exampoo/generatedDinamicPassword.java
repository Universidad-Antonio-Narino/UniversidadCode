package com.exampoo;

import java.util.*;
public class generatedDinamicPassword {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Random random = new Random();
        Integer[] numKeyWord = {1,2,3,4,5,6,7,8,9};
        for(int i = 0;i < 9;i++){
            int indexDigit = random.nextInt(numKeyWord.length);
            int intercambioTemporal = numKeyWord[i];
            numKeyWord[i] = numKeyWord[indexDigit];
            numKeyWord[indexDigit] = intercambioTemporal;
        }
        String passwordClient = "";
        for (int s = 0; s < 3; s++) {
            for (int i = 1; i < numKeyWord.length; i+=3) {
                String screenKeyword = "";
                for (int j = i; j < i+3 ; j++) {
                    screenKeyword += "|"+numKeyWord[j-1]+"|";
                }
            System.out.println(screenKeyword);
            }
            /*
             * se ingresa la posicion
             * |2| |1| |4|
             * |3| |7| |9|
             * |5| |8| |6|
             * 
             * si desea escribir 265
             * ud puede escribirlo asi
             * 197
             * 
             */
            System.out.println("Ingrese la posicion");
            int digit = input.nextInt();
            passwordClient += Integer.toString(numKeyWord[digit-1]);
        }
        System.out.println(passwordClient);

    }
    

}
