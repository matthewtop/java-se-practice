package pl.globallogic.hackerRank.JavaIntroduction;

import java.util.Scanner;

public class ex7JavaDatatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            try {

                long number = scanner.nextLong();

                if (number > Long.MAX_VALUE || number < Long.MIN_VALUE) {
                    System.out.println(number + " can't be fitted anywhere.");
                } else {
                    System.out.println(number + " can be fitted in:");

                    if (number >= -128 && number <= 127) {
                        System.out.println("* byte");
                    }
                    if (number >= -32768 && number <= 32767) {
                        System.out.println("* short");
                    }
                    if (number >= -2147483648 && number <= 2147483647) {
                        System.out.println("* int");
                    }
                    if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                        System.out.println("* long");
                    }

                }
            }
            catch(Exception e)
            {
                System.out.println(scanner.next()+" can't be fitted anywhere.");
            }
        }
    }
}