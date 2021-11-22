package ProductsManagementSystem;

public class Product {
    String Name;
    String Description;
    double Price;
    int[] rate;

    public void viewInfo() {  // câu hỏi: tại sao ở phương thức này không thể đặt từ khoá static.
        System.out.println("Name: " + Name);
        System.out.println("Description: " + Description);
        System.out.println("Price: " + Price);
    }
}
