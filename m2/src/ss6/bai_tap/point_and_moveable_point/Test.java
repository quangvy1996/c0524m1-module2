package ss6.bai_tap.point_and_moveable_point;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        MoveablePoint p2 = new MoveablePoint(3, 4, 5, 6);
        System.out.println("Before Move");
        System.out.println(p1);
        System.out.println(p2);
        p2.move();
        System.out.println("After move");
        System.out.println(p1);
        System.out.println(p2);
    }
}
