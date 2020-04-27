package pl.waw.sgh;

public abstract class Shape {
    protected double parA;
    protected double parB;

    public Shape(double a) {
        setParam(a);
    }

    public void setParam(double a) {
        parA = a;
    }

    public Shape(double a, double b) {
        setParams(a, b);
    }

    public void setParams(double parA, double b) {
        System.out.println("Changing parameters parA from: " + this.parA + " to: " + parA);
        this.parA = parA;
        parB = b;
    }

    public abstract double calcSurface();
//    {
//        return -1;
//    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " ["+ parA + ", " + parB + "]";
    }
}