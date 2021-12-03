package MarksManagement;

import java.util.ArrayList;

public class Reposibility {


    ArrayList<StudentMark> studentMarks = new ArrayList<>();

    public void insertStudent(StudentMark st) {
        this.studentMarks.add(st);
        System.out.println("added " + st);
    }

    public void printStudentList() {
        for (StudentMark st : studentMarks) {
            System.out.println(st);
        }
    }

    public float aveCal(float[] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        float average = sum / (array.length);
        return average;
    }

    public void averageMark() {
        Reposibility repo = new Reposibility();
        for (StudentMark st : studentMarks) {
            System.out.println(" name " + st.getFullName() + " : average " + repo.aveCal(st.getSubjectMarks()));
        }
    }
}
