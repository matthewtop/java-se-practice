package pl.globallogic.hackerRank.JavaIntroduction;

import java.util.Scanner;

public class ex8JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String one = scanner.next();
            int two = scanner.nextInt();
            System.out.printf("%-15s%03d%n",one,two);
        }
        System.out.printf("================================");

    }

}
