package MarksManagement;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentMark studentMark = new StudentMark();
        Reposibility repo = new Reposibility();
        int option = 0;


        do {
            System.out.println("Please select an option: ");
            System.out.println("1. insert new student \n" +
                    "2. view list of student \n" +
                    "3. average mark \n" +
                    "4. exit");
            System.out.println("enter your option:_");
            option = sc.nextInt();
            sc.nextLine();
            if (option == 1) {
                System.out.println("enter full name :");
                studentMark.fullName = sc.nextLine();
                System.out.println("enter id: ");
                studentMark.id = sc.nextInt();
                sc.nextLine();
                System.out.println("enter class: ");
                studentMark.aClass = sc.nextLine();
                System.out.println("enter semester: ");
                studentMark.semester = sc.nextInt();
                System.out.println("enter subject marks list: ");
                studentMark.subjectMarks = studentMark.subjectMarks();
                studentMark.averageMark = repo.aveCal(studentMark.subjectMarks);

                repo.insertStudent(studentMark);
            }

            if (option == 2) {
                repo.printStudentList();
            }

            if (option == 3) {
                repo.averageMark();
            }
        } while (option != 0);
    }
}
