package pl.globallogic.exercises.intermediate;

public class ex35Cylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " +
                cylinder.getRadius());
        System.out.println("cylinder.height= " +
                cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " +
                cylinder.getVolume());
    }

}

class Circle{
    private double radius;

    Circle(double radius){
        if(radius<0){
            this.radius=0;
        }
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return (radius*radius*Math.PI);
    }

}
class Cylinder extends Circle{
    private double height;

    Cylinder(double radius, double height){
        super(radius);
        if(height<0){
            this.height=0;
        }
        this.height=height;
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }
}
