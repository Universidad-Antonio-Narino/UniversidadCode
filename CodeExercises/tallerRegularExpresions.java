import java.util.Scanner;
import java.util.regex.*;

/**
 * tallerRegularExpresions
 */
public class tallerRegularExpresions {
    public static void main(String[] args) {
        String patron = "^123[123]*321$|12321";
        Pattern regex = Pattern.compile(patron); //creacion del patron
        //el que buscara coincidencias
        Scanner inputScanner = new Scanner(System.in);
        String cadena = inputScanner.nextLine();

        Matcher coincideMatcher =  regex.matcher(cadena);
        if(coincideMatcher.matches()){
            System.out.println("ACEPTA");
        }else{
            System.out.println("RECHAZA");
        }
    }
}