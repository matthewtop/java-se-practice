package pl.globallogic.exercises.intermediate;

public class ex32Point {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " +
                first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2,
                2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

    }
}

 class Point {
    private int x;
    private int y;

    Point(){}

    Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public double distance(){
        getX();
        getY();
        double x1=0;
        double y1=0;
        double distance = 0;
        distance= Math.sqrt((x-x1)*(x-x1)+(y1-y)*(y1-y));
        return distance;
    }

    public double distance(int x2, int y2){
        getX();
        getY();
        return(Math.sqrt((x-x2)*(x-x2)+(y2-y)*(y2-y)));
    }

     public double distance(Point second) {
        getX();
        getY();


        return(Math.sqrt((x-second.getX())*(x-second.getX())+(y-second.getY())*(y-second.getY())));

     }



}
