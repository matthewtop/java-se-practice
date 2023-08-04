package pl.globallogic.exercises.intermediate;

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
