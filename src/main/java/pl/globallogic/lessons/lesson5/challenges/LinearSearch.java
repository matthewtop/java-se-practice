package pl.globallogic.lessons.lesson5.challenges;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[]  targetArray = {2,5,7,3,8,5,9,45,267,23};
        int targetElement = 45;
        System.out.println(search(targetArray,targetElement ));

    }

    private static int search(int[] targetArray, int targetElement){
        for(int i= 0;i<targetArray.length;i++){
            if(targetArray[i]==targetElement){
                return i;
            }
        }
        return -1;
    }
}
