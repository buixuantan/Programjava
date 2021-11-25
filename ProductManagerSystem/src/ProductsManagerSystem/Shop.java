package ProductsManagerSystem;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> product;

    public Shop(ArrayList<Product> product) {
        this.product = product;
    }

    public Shop() {
        this.product = new ArrayList<Product>();
    }

    public void addProduct(Product pro) {
        this.product.add(pro);
    }

    public boolean removeProduct(Product pro) {
        return this.product.remove(pro);
    }

    public void searchProduct(String name) {
        for (Product pro : product) {
            if (pro.getName().indexOf(name) >= 0) {
                System.out.println(pro);
            }
        }
    }

}
