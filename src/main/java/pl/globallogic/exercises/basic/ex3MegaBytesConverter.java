package pl.globallogic.exercises.basic;

public class ex3MegaBytesConverter {
    public static void main(String[] args) {
        int kiloBytes = 5000;
        printMegaBytesAndKiloBytes(kiloBytes);
    }
    private static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0 ){
            System.out.printf("Invalid Value");
        }
        System.out.printf(kiloBytes + "KB = " + kiloBytes/1000 + "MB and " + (kiloBytes % 1024) +"KB" );
    }
}
