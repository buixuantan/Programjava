package StudentManagement;

import java.util.ArrayList;

public class Function {

    ArrayList<Student> studentList = new ArrayList<>();

    public void insert(Student student) {
        this.studentList.add(student);
        System.out.println("added " + student.toString());
    }

    public void viewList() {
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    public void search(Student student) {
        if (studentList.isEmpty()) {
            System.out.println("student list is empty!");
        } else {
            for (Student student1 : studentList) {
                if (student.name.equals(student1.name)) {
                    System.out.println(student1.toString());
                }
            }
            System.out.println("not find!");
        }
    }
}
