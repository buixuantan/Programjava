package ZooManagement;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zoo zoo = new Zoo();

        int choice = 6;
        do {
            System.out.println("MENU FOR ZOO MANAGEMENT SYSTEM");
            System.out.println("1. add cage \n" +
                    "2. remove cage \n" +
                    "3. add animal \n" +
                    "4. remove animal \n" +
                    "5. iterate animal \n" +
                    "6. exit ");
            System.out.println("Please Enter your option: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("enter cage number to add in cage list: ");
                int cagenumber = sc.nextInt();
                Cage cage = new Cage(cagenumber);
                zoo.addCage(cage);
            }

        } while (choice == 6);
    }
}
