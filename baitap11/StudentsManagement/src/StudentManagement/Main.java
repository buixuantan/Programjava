package StudentManagement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.util.Calendar.PM;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Function function = new Function();

        int option = 0;

        do {
            System.out.println("---MENU---");
            System.out.println("1. insert new student \n" +
                    "2. view list of student \n" +
                    "3. search student \n" +
                    "4. exit");
            System.out.println("option:_");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("enter name: ");
                String name = scanner.nextLine();
                System.out.println("enter id: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("enter date: ");
                String day = scanner.nextLine();
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date date = dateFormat.parse(day);
                System.out.println("enter native: ");
                String country = scanner.nextLine();
                System.out.println("enter class: ");
                String clas = scanner.nextLine();
                System.out.println("enter phoneNo: ");
                String phoneNo = scanner.nextLine();
                System.out.println("enter mobile: ");
                int mobile = scanner.nextInt();

                Student student = new Student(name, id,date,country,clas,phoneNo,mobile);
                function.insert(student);
            }

            if (option == 2) {
                function.viewList();
            }

            if (option == 3) {
                Student student = new Student();
                System.out.println("enter name to searching: ");
                student.name = scanner.nextLine();
                function.search(student);
            }

        } while (option!=0);
    }
}
