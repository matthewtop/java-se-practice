package pl.globallogic.exercises.intermediate;
//Write a method called isOdd with an int parameter and call it number. The method
//        needs to return a boolean.
//        Check that number is > 0, if it is not return false.
//        If number is odd return true, otherwise return false.
//        Write a second method called sumOdd that has 2 int parameters start and end, which
//        represent a range of numbers.
//        The method should use a for loop to sum all odd numbers in that range including the
//        end and return the sum.
//        It should call the method isOdd to check if each number is odd.
//        The parameter end needs to be greater than or equal to start and both start and end
//        parameters have to be greater than 0.
//        If those conditions are not satisfied return -1 from the method to indicate invalid input.

public class ex15SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
    }

    private static boolean isOdd(int number){
        return number > 0 && number % 2 != 0;
    }

    private static int sumOdd(int start, int end){
        if (start < 0 || end < 0 || end < start) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <=end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
