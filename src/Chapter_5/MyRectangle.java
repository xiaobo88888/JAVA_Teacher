package Chapter_5;

public class MyRectangle implements ShapeArea{
    private double width;
    private double height;

    public MyRectangle() {
    }

    public MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "width = " + width +
                "，height = " + height +
                "，perimeter = " + this.getPerimeter() +
                "，area = " + this.getArea();
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
