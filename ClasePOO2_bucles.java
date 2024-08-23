import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int opcion = -1;
           
        while(opcion != 4){
            Scanner input = new Scanner(System.in);
               
            System.out.println("Bienvenid@s al sistema");
            System.out.println("1 Registrar Cliente");
            System.out.println("2 Ingresar al sistema");
            System.out.println("3 Tablas de multiplicar");
            System.out.println("4 Salir");
            System.out.println("==========================");
            System.out.print("Ingrese una opción: ");
               
            opcion = input.nextInt();
            String user,useRegister;
            Integer cedula, passwordRegister;
            switch(opcion){
            case 1: 
                    System.out.print("Ingrese un nombre: ");
                    useRegister = input.nextLine();
                    input.nextLine();
                    System.out.print("Ingrese una cedula: ");
                    passwordRegister = input.nextInt();
                break;
            case 2:
                    System.out.println("Ingresa el usuario: ");
                    user = input.nextLine();
                    input.nextLine();
                    System.out.println("Ingrese la password: ");
                    cedula = input.nextInt();
                break;
            case 3:
                    System.out.println("Tablas de multiplicar dinamicas");
                break;
            case 4:
                    System.out.println("Ha salido del sistema");
                break;
            default: 
                    System.out.println("Opción no valida.");
                break;
            }
        }
    }
}
