package pl.globallogic.exercises.intermediate;

import java.util.Scanner;

public class ex27InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    private static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while(true){
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                sum +=number;
                counter++;
            }
            else {
                break;
            }
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
