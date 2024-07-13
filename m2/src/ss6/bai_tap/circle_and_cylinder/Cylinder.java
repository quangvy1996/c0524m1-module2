package ss6.bai_tap.circle_and_cylinder;


public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * Math.PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder{" +super.toString()+
                "height=" + height +
                '}';
    }
}
