package pl.globallogic.lessons.lesson2;

import java.util.Objects;
import java.util.Scanner;

public class ControlFlowSandbox {
    public static void main(String[] args) {
        //Scanner class to make exercises more interactive
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.printf("How many times you want me to greet you");
        int number_of_greets = scanner.nextInt();
        String greeting = switch (name.trim()){
            case "Chen", "Woo"-> "Nihao, " +name;
            case "Monika", "Maja" -> "Czesc, " +name;
            default -> "Hello, " + name;
        };
////        for (int i=0; i<number_of_greets;i++){
////            System.out.println(greeting);
////        }
//        int i = 0;
////        while (i<number_of_greets){
////            System.out.printf(greeting);
////            i++;
////        }
//        do{
//            System.out.println(greeting);
//            i++;
//        }while (i<number_of_greets);
        for (int i = 0; i <number_of_greets;i++){
            System.out.println(greeting);
            if(i == 1)
                break;
            System.out.println("Current iteration is " + i);

        }




//        String greeting = switch (name.trim()){
//            case "Chen", "Woo" -> "Nihao, " + name;
//            case "Maja": greeting = "Czesc, " + name;
//            default:greeting="Hello, " + name;
//        }
//        if (Objects.equals(name, "Grzegorz")){
//            greeting = "Czesc, " + name;
//        }
//        else if (Objects.equals(name, "Chen")){
//            greeting = "Nihao, "+name;
//        }
//        else {
//            greeting = "Hello, " + name;
//        }
//        System.out.printf(greeting);

//        switch (name.trim()){
//            case "Chen", "Woo" -> "Nihao, " + name;
//            case "Maja": greeting = "Czesc, " + name; break;
//            default:greeting="Hello, " + name; break;
//        }


        //How
    }
}
