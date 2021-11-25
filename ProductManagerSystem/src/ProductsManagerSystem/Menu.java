package ProductsManagerSystem;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        int choice = 5;

        do {
            System.out.println("-------MENU-------");
            System.out.println("PRODUCT MANAGEMENT SYSTEM \n" +
                    "1. add new product \n" +
                    "2. remove product \n" +
                    "3. print product list \n" +
                    "3. Iterate product list \n" +
                    "4. search product \n" +
                    "5. exit");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter product's name: ");
                String name = sc.nextLine();
                System.out.println("Enter description about product: ");
                String description = sc.nextLine();
                System.out.println("Enter price product: ");
                int price = sc.nextInt();

                Product pro = new Product(name, description, price);
                shop.addProduct(pro);
            }

            if (choice == 2) {
                System.out.println("Enter Product's name to remove: ");
                String name = sc.nextLine();
                Product pro = new Product(name);
                System.out.println("Remove Product in Shop: "+ shop.removeProduct(pro));
            }

            if (choice == 3) {
                System.out.println("sorry! not complete");
            }

            if (choice == 4) {
                System.out.println("Enter Product's name to search: ");
                String name = sc.nextLine();
                shop.searchProduct(name);
            }

        } while (choice != 5);

    }
}
