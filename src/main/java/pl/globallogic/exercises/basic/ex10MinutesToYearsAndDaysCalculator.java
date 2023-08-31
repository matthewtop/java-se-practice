package pl.globallogic.exercises.basic;
//Write a method printYearsAndDays with parameter of type long named minutes.
//        The method should not return anything (void) and it needs to calculate the years and days
//        from the minutes parameter.
//        If the parameter is less than 0, print text "Invalid Value".
//        Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY
//        y and ZZ d".
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
