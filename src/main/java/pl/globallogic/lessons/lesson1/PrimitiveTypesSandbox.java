package pl.globallogic.lessons.lesson1;

public class PrimitiveTypesSandbox {
    public static void main(String[] args) {
        int number = 34;
        byte smallNumber = 127; //max wartosc <-128;127>
        byte smallNumber2 = (byte)number;

        short mediumNumber = 3284;
        long bigNumber = 3218734923897l; // literka na koncu
        float pi = 3.1457654f;
        char symbol = 'a';
        boolean isJavaEasy = true;
        String fullName = "Mateusz Tolpa";
        int sum = number+smallNumber2;
        int diff = 11111-2000;
        int idx = 1;
        int reminder = 10 % 3;
        System.out.println(reminder);


    }
}
