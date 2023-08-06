package pl.globallogic.exercises.intermediate;

public class ex28PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println();
        System.out.println(getBucketCount(-3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(7.25,4.3,2.35));
    }

    private static int getBucketCount(double width,double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height <=0 || areaPerBucket <=0 || extraBuckets<0){
            return -1;
        }
        double areaToCover = width*height;
        double coveredArea = extraBuckets * areaPerBucket;
        double remainingArea = areaToCover - coveredArea;

        int neededBuckets = (int) Math.ceil(remainingArea/areaPerBucket); //return smallest int greater or equal to given number
        return neededBuckets;

    }

    private static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0||height<=0||areaPerBucket<=0){
            return -1;
        }
        double areaToCover = width*height;
        int neededBuckets = 0;
        neededBuckets = (int)Math.ceil(areaToCover/areaPerBucket);
        return neededBuckets;

    }
}
