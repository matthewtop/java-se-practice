package pl.globallogic.exercises.intermediate;
//Write a method called inputThenPrintSumAndAverage that does not have any
//        parameters.
//        The method should not return anything (void) and it needs to keep reading int numbers
//        from the keyboard.
//        When the user enters something that is not an int then it needs to print a message in the
//        format "SUM = XX AVG = YY".
//        XX represents the sum of all entered numbers of type int.
//        YY represents the calculated average of all numbers of type long.

import java.util.Scanner;

public class ex27InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    private static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
            counter++;
            scanner.nextLine();
        }
        if(counter>0){
            long average = 0;
            average = sum/counter;
            System.out.println("SUM = " + sum + " AVG = " + average);
        }
        else {
            System.out.println("SUM = 0 AVG = 0");
        }

    }
}
