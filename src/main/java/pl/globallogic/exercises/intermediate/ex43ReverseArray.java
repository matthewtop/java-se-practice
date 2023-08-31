package pl.globallogic.exercises.intermediate;
//Write a method called reverse() with an int array as a parameter.
//        The method should not return any value. In other words, the method is allowed to
//        modify the array parameter.
//        To reverse the array, you have to swap the elements, so that the first element is
//        swapped with the last element and so on

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
