package pl.globallogic.exercises.intermediate;

public class ex34ComplexOperations {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " +
                number.getImaginary());
    }
}

class ComplexNumber{
    private double real;
    private double imaginary;

    ComplexNumber(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public void add(int real, int imaginary){
        this.real+=real;
        this.imaginary+=imaginary;
    }
    public void add(ComplexNumber other){
        this.real+=other.real;
        this.imaginary+=other.imaginary;

    }
    public void subtract(double real, double imaginary){
        this.real-=imaginary;
        this.imaginary-=imaginary;
    }
    public void subtract(ComplexNumber other){
        this.real-= other.real;
        this.imaginary-=other.imaginary;
    }
}