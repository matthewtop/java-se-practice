package pl.globallogic.hackerRank.JavaIntroduction;

import java.util.Scanner;

public class ex4JavaStdinAndStdoutII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        double second = Double.parseDouble(scan.nextLine());
        String third = scan.nextLine();
        System.out.println("String: " + third);
        System.out.println("Double: " + second);
        System.out.println("Int: " + first);
    }
}