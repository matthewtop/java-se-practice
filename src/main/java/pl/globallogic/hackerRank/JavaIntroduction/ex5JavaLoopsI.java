package pl.globallogic.hackerRank.JavaIntroduction;
import java.io.*;
import java.util.Scanner;

public class ex5JavaLoopsI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i=1;i<11;i++){
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }
}
