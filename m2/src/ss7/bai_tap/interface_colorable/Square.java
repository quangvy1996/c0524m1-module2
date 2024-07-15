package ss7.bai_tap.interface_colorable;

import java.awt.*;

public class Square extends Shape implements Colorable {
    private double side = 1.0;

    public Square() {}
    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide()
                + ", which is a subclass of "
                + super.toString();

    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
