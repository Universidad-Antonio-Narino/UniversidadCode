import java.util.Scanner;

public class pruebasJava {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        String variable = inputUser.nextLine();
        String nuevaVariable = "";
        for (int i = 0; i < variable.length(); i++) {
            if(variable.charAt(i) == ' '){
                nuevaVariable += "+";
            }else{
                nuevaVariable += variable.charAt(i);
            }
        }
        System.out.println(nuevaVariable);
    }
}