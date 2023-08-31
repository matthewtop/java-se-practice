package pl.globallogic.exercises.basic;

public class ex10MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    private static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid value");
        }
        else {
            long years = (minutes/(365 *24 *60));
            long days = (minutes/(60*24) % 365);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
