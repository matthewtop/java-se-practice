package pl.globallogic.exercises.basic;

public class ex8TeenNumberChecker {
    public static void main(String[] args) {
        int num1 = 2229;
        int num2 = 9;
        int num3 = 99;
        hasTeen(num1,num2,num3);
        int singleNumber = 18;
        isTeen(singleNumber);
    }

    private static boolean hasTeen (int number1,int number2, int number3){
        if(number1 >=13 && number1 <=19 || number2 >=13 && number2 <=19 || number3 >=13 && number3 <=19 ){
            System.out.println("one of the numbers is teen");
            return true;
        }
        else {
            System.out.println("none of the numbers is teen");
            return false;
        }
    }
    private static boolean isTeen(int singleNumber){
        if(singleNumber >= 13 && singleNumber <=19){
            System.out.printf("number " + singleNumber+  " is teen");
            return true;
        }
        else{
            System.out.printf("number " + singleNumber + " is not teen");
            return false;
        }
    }
}
