package pl.globallogic.exercises.basic;

public class ex5LeapYearCalculator {
    public static void main(String[] args) {
        int year =2002;
        isLeapYear(year);
    }
    public static boolean isLeapYear (int year){
        if (year>=1 && year <= 9999){
            if(year % 4 == 0 && year % 100 != 0  || (year %400 == 0)){
                System.out.printf("leap year");
                return true;
            }
            else {
                System.out.printf("not leap year");
                return false;
            }
        }
        else{
            return false;
        }
    }
}
