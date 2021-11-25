package ProductsManagerSystem;

public class Product {
    private String name;
    private String description;
    private double price;
    private int [] rate;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
       // this.rate = rate;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int[] getRate() {
        return rate;
    }

    public void setRate(int[] rate) {
        this.rate = rate;
    }

    public void viewInfo() {
        System.out.println("Product's name: " + this.getName() +
                "Product description: " + this.getDescription() +
                "Price: " + this.getPrice());
    }
}
