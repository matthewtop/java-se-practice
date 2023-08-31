package pl.globallogic.exercises.intermediate;
//Write a method isLeapYear with a parameter of type int named year.
//        The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//        If the parameter is not in that range return false.
//        Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it
//        is, otherwise return false.

//Write another method getDaysInMonth with two parameters month and year. Both of
//        type int.
//        If parameter month is < 1 or > 12 return -1.
//        If parameter year is < 1 or > 9999 then return -1.
//        This method needs to return the number of days in the month. Be careful about leap
//        years they have 29 days in month 2 (February).

public class ex14NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));
    }
    private static boolean isLeapYear (int year){
        if (year>=1 && year <= 9999){
            return year % 4 == 0 && year % 100 != 0 || (year % 400 == 0);
        }
        else{
            return false;
        }
    }
    private static int getDaysInMonth(int month, int year){
        if(month<1 || month>12 || year <1 || year >9999){
            return -1;
        }
        else {
            int [] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
            if(month == 2 && isLeapYear(year)){
                return 29;
            }
            else {
                return daysInMonth[month -1];
            }
        }
    }
}
