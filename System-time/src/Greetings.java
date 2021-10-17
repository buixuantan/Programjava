import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        displayGreetings();

    }

    public static String displayGreetings() {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Typing Your Name: ");
        String name = scanner.nextLine();

        System.out.println("Hello: " + name);

        return name;

    }

}
