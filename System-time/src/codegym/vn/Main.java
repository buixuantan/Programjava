package codegym.vn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your " + rectangle.display());
        System.out.println("Rectangle Area: \n" + rectangle.getArea());
        System.out.println("Rectangle Perimeter: \n" + rectangle.getPerimeter());

    }
}
