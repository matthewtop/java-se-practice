package pl.globallogic.lessons.lesson5;

import pl.globallogic.lessons.lesson3.User;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class ArraySandbox {
    public static void main(String[] args) {
        //how to create an array
        String name1  = "Joe";
        String name2 = "Jane";
        String name3 = "Ivan";
        String[] names = new String[]{"Joe", "Jane","Ivan"};
        User[] users = new User[]{new User("Joe"), new User("Jane"), new User("Ivan")};

        //how to access an array element
        User joe = users[2];
        joe.name = "John";
        String joeName = names[0];
        joeName = "John";
//        System.out.println(users[0]);
//        System.out.println(names[0]);
        //how to looop in array
//        System.out.println(users[0]);
//        System.out.println(users[1]);
//        System.out.println(users[2]);
//        for(int i = 0; i<users.length;i++){
//            System.out.println(users[i]);
//        }
//        int i = 0;
//        while(i<users.length){
//            System.out.println(users[i]);
//            i++;
//        }

//        enhanced for loop
//        for(User user : users){
//            System.out.println(user);
//        }

        //array to string
        System.out.println(Arrays.toString(users));

        //sorting
        int [] unsortedNumbers = {6,4,6,8,9,3,12,10};
        Arrays.sort(unsortedNumbers);
        System.out.println(Arrays.toString(unsortedNumbers));

        //how to search in array Arrays.binarySearch(..)
        System.out.println(Arrays.binarySearch(unsortedNumbers,8) == 4 );

        //coppying an array
        int[] peaceOfOurSortedArray = Arrays.copyOfRange(unsortedNumbers,1,4);
        int[] sortedCopyOfArray = Arrays.copyOf(unsortedNumbers, 16);
        System.out.println(Arrays.toString(peaceOfOurSortedArray));
        int[] arrayOf100 = new int[20];
        Arrays.fill(arrayOf100,100);
        System.out.println(Arrays.toString(arrayOf100));
        int[] numbers1 = {1,2,3,8,1};
        int[] numbers2 = {1,2,3,4,5};
        System.out.println(Arrays.compare(numbers1,numbers2));
        System.out.println(Arrays.equals(numbers1,numbers2));




    }
}
