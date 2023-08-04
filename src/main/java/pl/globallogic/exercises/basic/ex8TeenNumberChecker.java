package pl.globallogic.exercises.basic;

public class ex8TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    private static boolean hasTeen (int number1,int number2, int number3){
        if(number1 >=13 && number1 <=19 || number2 >=13 && number2 <=19 || number3 >=13 && number3 <=19 ){
            return true;
        }
        else {
            return false;
        }
    }
    private static boolean isTeen(int singleNumber){
        if(singleNumber >= 13 && singleNumber <=19){
            return true;
        }
        else{
            return false;
        }
    }
}
