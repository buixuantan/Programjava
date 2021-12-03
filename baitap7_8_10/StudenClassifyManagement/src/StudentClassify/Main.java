package StudentClassify;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Repo repo = new Repo();
        Student st = new Student();

        int option = 0;

        do {
            System.out.println("MENU OPTION");
            System.out.println("1. add a student \n" +
                    "2. list student \n" +
                    "3. classify student \n" +
                    "4. exit");
            System.out.println("option:_");

            option = sc.nextInt();

            if ( option == 1) {
                System.out.println("enter id: ");
                st.id = sc.nextInt();
                sc.nextLine();
                System.out.println("enter name: ");
                st.name = sc.nextLine();
                System.out.println("enter class: ");
                st.aClass = sc.nextLine();
                System.out.println("enter math mark: ");
                st.math = sc.nextFloat();
                System.out.println("enter physic mark: ");
                st.physic = sc.nextFloat();
                System.out.println("enter chemistry mark: ");
                st.chemistry = sc.nextFloat();

                repo.insertStudent(st);
            }

            if (option == 2) {
                repo.printStudents();
            }

            if (option == 3) {
                repo.classifyStudent();
            }
        } while (option != 0);
    }
}
