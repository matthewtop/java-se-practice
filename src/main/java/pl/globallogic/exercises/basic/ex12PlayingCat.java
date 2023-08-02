package pl.globallogic.exercises.basic;

public class ex12PlayingCat {
    public static void main(String[] args) {
        boolean summer = false;
        int temperature = 35;
        isCatPlaying(summer,temperature);
    }
    public static boolean isCatPlaying (boolean summer, int temperature){
        if(temperature >=25 && temperature <= 35 ){
//            System.out.printf("true");
            return true;
        }
        if(temperature>=25 && temperature <=45 && summer == true){
//            System.out.printf("true");
            return true;
        }
        else{
//            System.out.printf("false");
            return false;
        }
    }
}
