package pl.globallogic.exercises.intermediate;

import java.util.Arrays;

public class ex43ReverseArray {
    public static void main(String[] args) {
        int[] array = {342,32434636,112112,3233245,66784,332,2};
        System.out.println("Original array: " + Arrays.toString(array));

        reverse(array);

    }

    private static void reverse(int[] array){
        int start=0;
        int end=array.length-1;
        while (start<end){
            int temp = array[start];
            array[start]=array[end];
            array[end]=temp;

            start++;
            end--;
        }
        System.out.print("Reversed array: ");
        for(int value:array){
            System.out.print( value + " ");

        }
    }
}
