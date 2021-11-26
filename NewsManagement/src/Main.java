import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        News news = new News();
        Rate rate = new Rate();

        int choice = 4;

        do {
            System.out.println("----MENU TO CHOOSE----");
            System.out.println("1. insert news \n" +
                    "2. view list news \n" +
                    "3. average rate \n" +
                    "4. exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                news.insertNews(news);
            }

            if (choice == 2) {
                news.viewNewsList();
            }

            if (choice == 3) {
                rate.averageRate();
            }

        } while (choice != 4);

    }
}
