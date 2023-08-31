package pl.globallogic.exercises.basic;
//Write a method hasEqualSum with 3 parameters of type int.
//        The method should return boolean and it needs to return true if the sum of the first and
//        second parameter is equal to the third parameter. Otherwise, return false.

public class ex7EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }
    private static boolean hasEqualSum(int num1, int num2, int num3){
        int sum = num1+num2;
        return sum == num3;
    }

}
