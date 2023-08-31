package pl.globallogic.exercises.basic;

//Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int
//        with the name kiloBytes.
//        The method should not return anything (void) and it needs to calculate the megabytes
//        and remaining kilobytes from the kilobytes parameter.
//        Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
//        For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB
//        and 452 KB"
//        If the parameter kiloBytes is less than 0 then print the text "Invalid Value".

public class ex3MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    private static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0 ){
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kiloBytes + "KB = " + kiloBytes/1024 + "MB and " + (kiloBytes % 1024) +"KB" );
    }
}
