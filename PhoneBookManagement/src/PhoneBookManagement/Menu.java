package PhoneBookManagement;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        int choice = 0;

        do {
            System.out.println("MENU FOR PHONEBOOK");
            System.out.println("1. insert phone \n" +
                    "2. remove phone \n" +
                    "3. update phone \n" +
                    "4. search phone \n" +
                    "5. sort phone book \n" +
                    "0. exit.");
            System.out.println("please enter your option: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("enter name: ");
                String name = sc.nextLine();
                System.out.println("enter phone number: ");
                String phone = sc.nextLine();
                phoneBook.insertPhone(name, phone);
            }

            if (choice == 2) {
                System.out.println("enter name need to remove");
                String name = sc.nextLine();
                phoneBook.removePhone(name);
            }

            if (choice == 3) {
                System.out.println("enter name: ");
                String name = sc.nextLine();
                System.out.println("new phone need to updates: ");
                String phone = sc.nextLine();
                phoneBook.updatePhone(name, phone);

            }

            if (choice == 4) {
                System.out.println("enter name: ");
                String name = sc.nextLine();
                phoneBook.searchPhone(name);
            }

            if (choice == 5) {
                System.out.println("phone book list sort: ");
                phoneBook.sort();
            }

        } while (choice != 0);
    }
}
