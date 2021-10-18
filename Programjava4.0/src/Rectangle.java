import Geometry.Shape;

public class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public  Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }

    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return (width + length)*2;
    }

    public String toString() {
        return "The rectangle with: " + "width = " + getWidth() + ", length = " + getLength()
                + " which is a subclass of " + super.toString() + "\n"
                + "The rectangle area is: " + getArea() + "\n"
                + "The rectangle perimeter is: " + getPerimeter();
    }
}
//    Lớp Rectangle
//    Có thêm hai thuộc tính là width và length (double).
//
//        Có ba phương thức khởi tạo. Phương thức khởi tạo mà không cần đối số đầu vào sẽ đặt giá trị mặc định cho width và length là 1.0.
//
//        Có các getter và setter cho tất cả các thuộc tính.
//
//        Có phương thức getArea và getPerimeter trả về diện tích và chu vi của hình.
//
//        Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy".Trong đó yyy là kết quả thực thi từ phương thức toString của lớp Shape.
//
//        Có một lớp con là lớp Square.
