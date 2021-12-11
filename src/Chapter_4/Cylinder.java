package Chapter_4;

public class Cylinder extends Circle{
    private double length;

    public Cylinder(double length) {
        this.length = length;
    }

    public Cylinder(double radius, double length) {
        super(radius);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 返回圆柱体体积
     * @return
     */
    public double findVolume(){
        return this.findArea() * this.getLength();
    }

    @Override
    public String toString() {
        return "半径：" + this.getRadius()
                + "，高：" + this.getLength()
                + "，体积：" + this.findVolume();
    }
}
