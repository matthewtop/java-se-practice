package pl.globallogic.exercises.basic;

public class ex10MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        long minutes = 561600;
        printYearsAndDays(minutes);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.printf("Invalid value");
        }
        else {
            long years = (minutes/(365 *24 *60));
            long days = (minutes/(60*24) % 365);
            System.out.printf(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
