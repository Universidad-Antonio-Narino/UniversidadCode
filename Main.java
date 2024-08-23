import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        int opcion = -1;
        Map<String,Integer> dba = new HashMap<>();

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
                    System.out.println("Ingrese un nombre: ");
                    useRegister = input.next();
                    input.nextLine();
                    System.out.println("Ingrese una cedula: ");
                    passwordRegister = input.nextInt();
                    dba.put(useRegister, passwordRegister);
                break;
            case 2:
                    System.out.println("Ingresa el usuario: ");
                    user = input.next();
                    input.nextLine();
                    System.out.println("Ingrese la password: ");
                    cedula = input.nextInt();
                    if(dba.containsValue(cedula) && dba.containsKey(user)){
                        System.out.println("Bienvenido "+user);
                    }else{
                        if(!dba.containsKey(user)){
                            System.out.println("Usuario incorrecto");
                        }else if (!dba.containsValue(cedula)){
                            System.out.println("Contraseña incorrecta");
                        }
                    }
                break;
            case 3:
                System.out.println("Ingrese un numero: ");
                int numberRestriction = input.nextInt(); 
                System.out.println
                ("------------------------------------------------------------");
                for (int indentations = 1; indentations < 9; indentations+=3){
                    for (int multipl = 1; multipl < 11; multipl++) {
                        String linea="";
                        for (int numsTable = indentations; numsTable < indentations+3; numsTable++) {
                            if (numsTable<numberRestriction) {
                                linea += "\t-x-=-\t";
                            }else{
                                linea +="\t"+numsTable+"x"+multipl+"="+numsTable*multipl+"\t";
                            }
                        }
                    System.out.println(linea);
                    }
                System.out.println("------------------------------------------------------------");
                }
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
