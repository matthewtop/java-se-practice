package pl.globallogic.exercises.intermediate;
//Write a method called readInteger() that has no parameters and returns an int.
//        It needs to read in an integer from the user - this represents how many elements the user
//        needs to enter.
//        Write another method called readElements() that has one parameter of type int
//        The method needs to read from the console until all the elements are entered, and then
//        return an array containing the elements entered.
//        And finally, write a method called findMin() with one parameter of type int[]. The method
//        needs to return the minimum value in the array.

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