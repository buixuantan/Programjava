package Geometry;

public class Circle extends Shape {
    public double radius;

    public Circle () {

    }

    public Circle (double radius) {
        this.radius = radius;
    }
    // hàm khởi tạo này là thừa, vì hàm khởi tạo bên dưới đã bao gồm hàm này rồi.

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea () {
        return Math.pow(radius,2)*Math.PI;
    }

    public double getPerimeter () {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString () {
        return "The circle radius is: "
                + getRadius() + "\n" +
                "Which is a subclass of "
                 + super.toString();
//                "The circle area is: "
//                + getArea() + "\n" +
//                "The circle perimeter is: "
//                + getPerimeter();

    }



}
//    Có thêm thuộc tính radius (double).
//
//        Có ba phương thức khởi tạo. Phương thức khởi tạo mà không cần đối số đầu vào sẽ đặt giá trị mặc định cho radius là 1.0.
//
//        Có các getter và setter cho cả ba phương thức.
//
//        Có phương thức getArea và getPerimeter trả về diện tích và chu vi của hình.
//
//        Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu "A Circle with radius=xxx, which is a subclass of yyy". Trong đó yyy là kết quả thực thi từ phương thức toString của lớp Shape.
