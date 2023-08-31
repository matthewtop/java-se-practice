package pl.globallogic.exercises.intermediate;

import java.util.Scanner;

public class ex42MinimumElement {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = readInteger();
        int[] elements = readElements(count);
        int minValue = findMin(elements);
        System.out.println("Minimum element: " + minValue);

    }

    private static int readInteger() {
        System.out.println("Enter the number of elements of an array: ");
        return scanner.nextInt();
    }

    private static int[] readElements(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " elements:");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE; // initialize minValue to a high value
        for (int value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
}