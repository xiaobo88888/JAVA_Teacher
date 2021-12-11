package Chapter_4;

public class Circle {
    private double radius;

    /**
     * 返回圆的面积
     * @return
     */
    public double findArea(){
        return 3.14 * radius * radius;
    }
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
