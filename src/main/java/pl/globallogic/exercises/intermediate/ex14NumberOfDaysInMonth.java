package pl.globallogic.exercises.intermediate;

public class ex14NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));


    }
    private static boolean isLeapYear (int year){
        if (year>=1 && year <= 9999){
            if(year % 4 == 0 && year % 100 != 0  || (year %400 == 0)){
//                System.out.printf("leap year");
                return true;
            }
            else {
//                System.out.printf("not leap year");
                return false;
            }
        }
        else{
            return false;
        }
    }
    private static int getDaysInMonth(int month, int year){
        if(month<1 || month>12 || year <1 || year >9999){
//            System.out.printf("Incorrect data");
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
