
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Tipos Primitivos
            // Numericos
            byte numero = 11; // 8 bits
            short numeroB = 2; // 16 bits
            int precioCelular = 200000; // 32 bits
            long numeroLargo = 122; // 64 bits
            
            // Numeros flotantes
            float flotanteA = 1.23F;
            double flotanteB = 1.765432345d;
                        
           // Texto
           char c = '\u0000';
           String saludo = "  Hola Mundo UAN con Variable  ";
           
           // Booleanos
           boolean esMayorDeEdad = true; // false 
           
            System.out.println(saludo);
            
            // Operadores aritmeticos
            // suma: + 
            // resta: - 
            // multiplicacion: * 
            // division: /
            // modulo: %
            
            // Boolean
            boolean tengoDinero = true;
            boolean juegaMiEquipoFavorito = false;
            boolean estaLloviendo = true;
            boolean asistirPartido = tengoDinero && juegaMiEquipoFavorito || estaLloviendo;
            System.out.println(asistirPartido); 
            
            
            // STRING
            String saludos = "Hola"; // Mundo Java
            System.out.println(saludos);
            
            String mayuscula = saludos.toUpperCase();
            System.out.println(mayuscula);
            
            //Para entrada de usuario
            Scanner input = new Scanner(System.in);
            System.out.print("Ingrese un nombre: ");
            String name = input.nextLine();
            System.out.println("Mi nombre es "+name);
            System.out.print("Ingrese una cedula: ");
            Integer cedula = input.nextInt();
            System.out.println("Su nombre es "+name+", su cedula es "+cedula);
            System.out.print("Ingrese su usuario: ");
            String userRegister = input.nextLine();
            input.nextLine();
            System.out.print("Ingrese su password: ");
            Integer passwordRegister = input.nextInt();
            
            if(name == userRegister && cedula == passwordRegister){
                System.out.print("Bienvenido al sistema sr "+name);
            }else{
                System.out.println("Sus credenciales estan mal");
                System.out.print((name.equals(userRegister))?"Usuario incorrecto":"");
                System.out.print((cedula !=passwordRegister)?"Contraseña incorrecta":"");
            }
    }
    
}
