package CodeExercises;


class tablasMultiplicar {
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        for (int i = 0; i < 9; i+=3){
            //tabulador \t
            for (int j = 1; j < 11; j++) {
                System.out.println((i+1)+"x"+j+"="+(i+1*j)+"\t"+(i+2)+"x"+j+"="+(i+2*j)+"\t"+(i+3)+"x"+j+"="+(i+3*j));
            }
            System.out.println("-----------------------------");
        }
    }
}