package pl.globallogic.exercises.basic;

public class ex5LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
    private static boolean isLeapYear (int year){
        if (year>=1 && year <= 9999){
            if(year % 4 == 0 && year % 100 != 0  || (year %400 == 0)){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
    }
}
