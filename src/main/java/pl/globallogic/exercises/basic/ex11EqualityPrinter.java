package pl.globallogic.exercises.basic;

public class ex11EqualityPrinter {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        printEqual(num1,num2,num3);

    }
    private static void printEqual (int num1, int num2, int num3){
        if(num1 <0 || num2 < 0 || num3 <0){
            System.out.printf("Invalid value");
        } else if (num1 == num2 && num2 == num3 && num1 == num3 ) {
            System.out.printf("All numbers are equal");
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.printf("All numbers are different");
        }
        else {
            System.out.printf("Neither all are equal or different");
        }
    }
}
