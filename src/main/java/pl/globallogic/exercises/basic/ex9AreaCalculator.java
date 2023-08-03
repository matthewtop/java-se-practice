package pl.globallogic.exercises.basic;

public class ex9AreaCalculator {
    public static void main(String[] args) {
        double radius = 34;
        double x =100;
        double y =25;
        area(radius);
        area(x,y);
    }
    private static double area(double radius){
        if(radius<0){
            return -1.0;
        }
        else {
//            double result;
//            result = radius * radius * Math.PI;
//            System.out.println(result);
            return radius * radius * Math.PI;
        }
    }

    private static double area (double x, double y){
        if(x <0 || y<0){
            return -1.0;
        }
        else{
//            double result;
//            result = x*y;
//            System.out.println(result);
            return (x*y);
        }
    }
}
