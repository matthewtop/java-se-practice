package pl.globallogic.exercises.basic;

public class ex12PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
    }
    private static boolean isCatPlaying (boolean summer, int temperature){
        if(temperature >=25 && temperature <= 35 ){
            return true;
        }
        if(temperature>=25 && temperature <=45 && summer == true){
            return true;
        }
        else{
            return false;
        }
    }
}
