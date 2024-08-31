/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void main(String[] args){
        boolean[][] filas = new boolean[4][6];
        Scanner input = new Scanner(System.in);
        int aforo = 0;
        while (aforo != 24){
            System.out.println("Ingrese la fila");
            int fila = input.nextInt();
            System.out.println("Ingrese la silla: ");
            int silla = input.nextInt();
        
             System.out.println(aforo);
            if(filas[fila-1][silla-1]){
                System.out.println("Ocupado");
            }
            else{
                filas[fila-1][silla-1] = true;
            }
            //Pintar cinema
            for(int filaSearch = 0; filaSearch < filas.length;filaSearch++){
                for(int sillaSearch = 0;sillaSearch<filas[0].length;sillaSearch++){
                String ocupado = "";
                if(filas[filaSearch][sillaSearch]){
                    ocupado = "\t|x|\t";
                    aforo+=1;
                }else{
                    ocupado = "\t|_|\t";
                }
                System.out.print(ocupado);
            }
            System.out.println();
            }    
        }
        
    }
}
