package pl.globallogic.exercises.basic;

public class ex4BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true,1);
    }

    private static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            }
            else if (hourOfDay < 8 || hourOfDay > 22) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
