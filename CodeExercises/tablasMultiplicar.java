package CodeExercises;

import java.util.Scanner;

//import java.util.Scanner;

class tablasMultiplicar {
    public static void main(String[] args) {
        Scanner keywords = new Scanner(System.in);
        int numberRestriction = keywords.nextInt(); 
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
    }
}