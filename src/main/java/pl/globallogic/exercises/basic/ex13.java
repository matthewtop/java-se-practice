package pl.globallogic.exercises.basic;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        System.out.println(sumOfDigits(number));

    }
    private static int sumOfDigits(int number){
       int temp=0;
       int sum=0;
        if(number<0){
            temp= -number;
        }
        else {
            temp=number;
        }
        if(temp==0){
            return 0;
        }
        while (temp>9){
            sum += temp%10;
            temp /= 10;
        }
        sum += temp;

        return sum;
    }
}
