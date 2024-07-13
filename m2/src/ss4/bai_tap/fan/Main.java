package ss4.bai_tap.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, "yellow", 10, true);
        Fan fan2 = new Fan(2, "blue", 5, false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
