package pl.globallogic.exercises.basic;

public class ex7EqualSumChecker {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        hasEqualSum(num1,num2,num3);

    }
    private static boolean hasEqualSum(int num1, int num2, int num3){
        int sum = num1+num2;
        if (sum == num3){
            System.out.printf("sum of first two ints is equal to third int");
            return true;
        }
        else{
            System.out.printf("sums are not equal");
            return false;
        }
    }

}
