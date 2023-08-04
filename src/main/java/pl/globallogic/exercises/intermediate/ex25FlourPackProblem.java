package pl.globallogic.exercises.intermediate;

public class ex25FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));  //f
        System.out.println(canPack(1,0,5)); //t
        System.out.println(canPack(0,5,4)); //t
        System.out.println(canPack(2,2,11)); //t
        System.out.println(canPack(-3,2,12)); //f
    }

    private static boolean canPack(int bigCount, int smallCount, int goal){

        if(smallCount <0 || bigCount <0  || goal<0 ){
            return false;
        }

        int kilosInBigCount = 5 * bigCount;
        int kilosInSmallCount = smallCount;

        return (kilosInBigCount <= goal);



    }
}
