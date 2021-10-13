import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"tan", "huu", "hoang", "long"};
        System.out.println("Enter student's name: ");
        String input_name = scanner.nextLine();

        boolean isExit = false;

        for (int i = 0;i < students.length;i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of " + input_name + " in the list is " + i);
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println(" Not found " + input_name + " in the list ");
        }
    }
}
