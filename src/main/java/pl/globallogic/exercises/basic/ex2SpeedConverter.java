package pl.globallogic.exercises.basic;

public class ex2SpeedConverter {
    public static void main(String[] args) {
        double kilometersPerHour = 75.114;
        toMilesPerHour(kilometersPerHour);
        printConversion(kilometersPerHour);

    }
    private static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
    private static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0 ){
            System.out.printf("Invalid value");
        }
        else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.printf(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");

        }
    }
}
