package ss7.bai_tap.interface_colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(3.4);
        System.out.println(square);

        square = new Square(2.7, "black", true);
        System.out.println(square);

        square.howToColor();
        System.out.println(square);
    }

}
