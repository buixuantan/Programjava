package Geometry;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2, 3);
        System.out.println(rectangle);

        rectangle = new Rectangle(3, 4, "blue", true);
        System.out.println(rectangle);
    }
}
