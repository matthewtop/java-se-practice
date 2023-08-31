package pl.globallogic.exercises.intermediate;
//Write a method named printFactors with one parameter of type int named number.
//        If number is < 1, the method should print "Invalid Value".
//        The method should print all factors of the number. A factor of a number is an integer
//        which divides that number wholly (i.e. without leaving a remainder).
//        For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In
//        other words 6 / 3 = 2.

public class ex21AllFactors {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
            return;
        }

        for(int factor=1; factor<=number;factor++){
            if(number % factor == 0){
                System.out.println(factor);
            }
        }
        System.out.println("---------------------");
        System.out.println("All factorials of number " + number);
        System.out.println("---------------------");
    }
}
