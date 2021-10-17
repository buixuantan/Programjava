import java.util.Scanner;
public class Shape {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Draw triangle");
            System.out.println("2. Draw square");
            System.out.println("3. Draw rectangle");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    drawTriangle(4);
                    break;
                case 2:
                    drawSquare(3);
                    break;
                case 3:
                    drawRectangle(2,5);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice in Menu!");

            }

        }


    }

    public static void drawTriangle(int n) {
        for (int i = 1;i <= n; i++) {
            for (int j = 1;j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawSquare(int n) {
        for (int i = 1;i <= n; i++) {
            for (int j = 1;j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawRectangle(int n, int m) {
        for (int i = 0;i <= n; i++) {
            for (int j = 0;j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// n, m là chiều dài, chiều rộng của hình.
// bài này nên làm thêm bước: khi người ta chọn hình để vẽ, thì nên thêm một tuỳ chọn nhận chiều dài và rộng của hình.
