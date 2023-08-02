package pl.globallogic.hackerRank.JavaIntroduction;
import java.io.*;
import java.util.*;

public class ex6JavaLoopsII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int a, b, n;
        for (int i = 0; i < q; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();
            factorial(a, b, n);
        }
    }

    static void factorial(int a, int b, int n){
        int x =a;
        for (int j = 0; j < n; j++) {
            x += b * (1<<j);
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
