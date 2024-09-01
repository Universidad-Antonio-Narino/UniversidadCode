import java.util.*;

public class CinemaClassPOO {
        public static void main(String[] args){
            boolean[][] filas = new boolean[4][6];
            Scanner input = new Scanner(System.in);
            int aforo = 0;
            while (aforo != 24){
                System.out.println("Ingrese la fila");
                int fila = input.nextInt();
                System.out.println("Ingrese la silla: ");
                int silla = input.nextInt();
            
                if(filas[fila-1][silla-1]){
                    System.out.println("Ocupado");
                }
                else{
                    filas[fila-1][silla-1] = true;
                    aforo+=1;
                }
                //Pintar cinema
                for(int filaSearch = 0; filaSearch < filas.length;filaSearch++){
                    for(int sillaSearch = 0;sillaSearch<filas[0].length;sillaSearch++){
                    String ocupado = "";
                    if(filas[filaSearch][sillaSearch]){
                        ocupado = "\t|x|\t";
                    }else{
                        ocupado = "\t|_|\t";
                    }
                    System.out.print(ocupado);
                    }
                System.out.println();
                }
            System.out.println("\n\n\n\t\t\t|-------------------------------------------------|");
            }
            System.out.println("Todos los asientos estan vendidas, ya no hay boletas para esta sala");
        }
}