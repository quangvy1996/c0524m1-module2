package ss5.bai_tap.Circle;

public class Circle {
    private double radius = 1;
    private String color= "red";

    Circle(){};
    Circle(double radius){
        this.radius = radius;
    }
    private double getRadius() {
        return radius;
    }
    private double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    protected void display() {
        System.out.println("Radius: " + this.radius + "\nColor: " + this.color + "\nArea: " + this.getArea());
    }
}
