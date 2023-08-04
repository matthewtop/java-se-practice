package pl.globallogic.exercises.basic;

public class ex1PositiveNegativeOrZero {
    public static void main(String[] args) {
        checkNumber(5);
    }
    private static void checkNumber(int number){
        if(number > 0){
            System.out.printf("positive");
        }
        else if(number < 0){
            System.out.printf("negative");
        }
        else if(number == 0){
            System.out.printf("zero");
        }
        else{
            System.out.printf("incorrect input");
        }
    }
}
