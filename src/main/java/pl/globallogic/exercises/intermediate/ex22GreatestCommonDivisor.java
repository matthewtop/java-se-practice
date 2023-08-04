package pl.globallogic.exercises.intermediate;

public class ex22GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisior(25,15));
        System.out.println(getGreatestCommonDivisior(12,30));
        System.out.println(getGreatestCommonDivisior(9,18));
        System.out.println(getGreatestCommonDivisior(81,153));
    }

    private static int getGreatestCommonDivisior(int first, int second){
        if(first<10 || second <10){
            return -1;
        }
        if(first<second){
            getGreatestCommonDivisior(second,first); //swap
        }

        while(second!=0){
            int tempSecond = second;
            second = first % second;
            first = tempSecond;
        }
        return first;
    }
}
