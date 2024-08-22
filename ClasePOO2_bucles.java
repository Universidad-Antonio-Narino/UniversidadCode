import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        /*
           System.out.print("Ingrese un número: ");
           int numero = sc.nextInt();
           
           System.out.println("El número ingresado es " + numero);
           
           /// ===  CICLO FOR === ///
           
           /// Declaración; Evaluación; Incremento
           for(int i=0; i<=numero; i++){
               System.out.println("Iteración for: " + i);
               
           }
           
           
           /// ===  CICLO WHILE === ///
           
           //A. Declaración de la variable
           int contador = 0;
           
           //B. Expresión de evaluación de la variable númerica
           //Primero evalua y después ejecuta
           
           while(contador <= numero){
               
               System.out.println("Iteración while " + contador);
           //C. Incremento
           //Aumentar el contador con el fin que se acabe el ciclo 
           contador++;
           
           }
           
           /// === CICLO DO-WHILE === ///
           //Se ejecuta una vez y evalua
           int contador2 = 0;
           do{
               System.out.println("Iteración do-while " + contador2);
               contador2++;
           }
           while(contador2 <= numero);
           
        */
           
           int opcion = -1;
           
           while(opcion != 4){
               
               System.out.println("Bienvenid@s al sistema");
               System.out.println("1 Registrar Cliente");
               System.out.println("2 Ingresar al sistema");
               System.out.println("3 Tablas de multiplicar");
               System.out.println("4 Salir");
               System.out.println("==========================");
               System.out.print("Ingrese una opción: ");
               
               opcion = sc.nextInt();
               String user,useRegister;
               Integer Cedula, passwordRegister;
               Scanner input = new Scanner(System.in);
               switch(opcion){
                    case 1: 
                        System.out.print("Ingrese un nombre: ");
                        String name = input.nextLine();
                        System.out.print("Ingrese una cedula: ");
                        Integer cedula = input.nextInt();
                        break;
                    case 2:
                       System.out.println("Modulo para ingresar al sistema");
                       
                       break;
                    case 3:
                       System.out.println("Tablas de multiplicar dinamicas");
                       
                       break;
                    case 4:
                       System.out.println("Ha salido del sistema");
                       
                       break;
                    default: System.out.println("Opción no valida.");
                       break;
            }
        }
       
       
       
       
    }
    
    
    
}
