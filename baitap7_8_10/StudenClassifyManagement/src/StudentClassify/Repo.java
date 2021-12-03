package StudentClassify;

import java.util.ArrayList;

public class Repo {

    private ArrayList<Student> students = new ArrayList<>();

    public void insertStudent(Student st) {
        this.students.add(st);
        System.out.println("added " + st);
    }

    public  void printStudents() {
        for (Student st : students) {
            System.out.println(st.display());
        }
    }

    public void isGood() {
        for (Student st : students) {
            float average = (st.math + st.physic + st.chemistry)/3;
            if (average >= 8.5) {
                System.out.println("name" + st.name + "," + average + " good");
            }
        }
    }

    public void isFair() {
        for (Student st : students) {
            float average = (st.math + st.physic + st.chemistry)/3;
            if (7.0 <= average && average < 8.5) {
                System.out.println("name" + st.name + "," + average + " fair");
            }
        }
    }

    public void isNormal() {
        for (Student st : students) {
            float average = (st.math + st.physic + st.chemistry)/3;
            if ( 5.0 <= average && average < 7.0) {
                System.out.println("name" + st.name + "," + average + " normal");
            }
        }
    }

    public void isBad() {
        for (Student st : students) {
            float average = (st.math + st.physic + st.chemistry)/3;
            if (average < 5.0) {
                System.out.println("name" + st.name + "," + average + " bad");
            }
        }
    }

    public void classifyStudent () {
        this.isGood();
        this.isFair();
        this.isNormal();
        this.isBad();
    }


}
