package pl.globallogic.exercises.basic;
//We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//        Write a method named hasTeen with 3 parameters of type int.
//        The method should return boolean and it needs to return true if one of the parameters is in
//        range 13(inclusive) - 19 (inclusive). Otherwise return false.
//        Write another method named isTeen with 1 parameter of type int.
//        The method should return boolean and it needs to return true if the parameter is in range
//        13(inclusive) - 19 (inclusive). Otherwise return false.
public class ex8TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    private static boolean hasTeen (int number1,int number2, int number3){
        return number1 >= 13 && number1 <= 19 || number2 >= 13 && number2 <= 19 || number3 >= 13 && number3 <= 19;
    }
    private static boolean isTeen(int singleNumber){
        return singleNumber >= 13 && singleNumber <= 19;
    }
}
