package Chapter_5;

public class MyTriangle implements ShapeArea{
    private double a;
    private double b;
    private double c;
    private double s;

    public MyTriangle() {
    }

    public MyTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = (a + b + c) / 2;
    }

    @Override
    public String toString() {
        return "three sides:" + a + "," + b + "," + c + ","
                + ",perimeter=" + this.getPerimeter()
                + ",area=" + this.getArea();
    }

    @Override
    public double getArea() {
        //用海伦公式
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return 2 * s;
    }
}
