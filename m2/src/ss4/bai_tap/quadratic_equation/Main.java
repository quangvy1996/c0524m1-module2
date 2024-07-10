package ss4.bai_tap.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.getDiscriminant() < 0) {
            System.out.println("No solution");
        }
        if (equation.getDiscriminant() == 0) {
            double root1 = equation.getRoot1();
            System.out.println("Equation has double root: " + root1);
        }
        if (equation.getDiscriminant() > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("Equation has two roots: " + root1 + " and " + root2);
        }
    }
}




