package pl.globallogic.exercises.basic;

public class ex1checkNumber {
    public static void main(String[] args) {
        int number = 5;
        checkNumber(number);
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
