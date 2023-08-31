package pl.globallogic.exercises.intermediate;

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
        if(number>0 && number % 2 !=0) {
            return true;
        }
        else {
            return false;
        }
    }

    private static int sumOdd(int start, int end){
        if (start < 0 || start > end || end < 0 || end < start) {
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
