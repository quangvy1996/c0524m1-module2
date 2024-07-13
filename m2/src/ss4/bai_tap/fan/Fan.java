package ss4.bai_tap.fan;

public class Fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, String color, double radius, boolean on) {
        this.speed = speed;
        this.color = color;
        this.on = on;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String toString() {
        if (this.on) {
            return "Fan{speed= " + this.speed + ", color= " + this.color + ", radius: " + this.radius + "}"
                    + " Fan is on";


        } else {
            return "Fan{color= " + this.color + ", radius: " + this.radius + "}"
                    + " Fan is off";
        }
    }
}
