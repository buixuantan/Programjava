package Geometry;

public class TestCircle {
    public static void main(String[] args) {


        Circle circle1 = new Circle();
        System.out.println(circle1);

        circle1 = new Circle(2);
        System.out.println(circle1);

        circle1 = new Circle(2, "red", false);
        System.out.println(circle1);



//        Circle circle = new Circle(2);
//        System.out.println(circle);

//        Circle circle = new Circle();
//        circle.setRadius(2);
//        System.out.println(circle);

    }
}
