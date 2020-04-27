package pl.waw.sgh;

public class Circle extends Shape {


    public Circle(double a) {
        super(a);
    }

    @Override
    public double calcSurface() {
        return Math.PI*parA*parA;
    }
}