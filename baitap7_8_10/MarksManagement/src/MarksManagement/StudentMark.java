package MarksManagement;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMark implements IStudentMark {

    String fullName;
    int id;
    String aClass;
    int semester;
    float averageMark;

float[] subjectMarks = new float[5];


    public StudentMark(String fullName, int id, String aClass, int semester, float averageMark) {
        this.fullName = fullName;
        this.id = id;
        this.aClass = aClass;
        this.semester = semester;
        this.averageMark = averageMark;
    }

    public StudentMark() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }

    public float[] getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(float[] subjectMarks) {
        this.subjectMarks = subjectMarks;
    }


    public float[] subjectMarks() {
        Scanner sc = new Scanner(System.in);
        float[] subjectMarkList = new float[5];
        for (int i = 0; i < subjectMarkList.length; i++) {
            System.out.println("enter index: " + i);
            subjectMarkList[i] = sc.nextFloat();
        }
        return subjectMarkList;
    }

    //      CHƯA HIỂU NGỤ Ý CỦA HÀM NÀY TRONG INTERFACE ĐỂ LÀM GÌ?
    @Override
    public void display() {
        System.out.println("full name: " + fullName +
                "id: " + id +
                "class: " + aClass +
                "semester: " + semester +
                "average mark: " + averageMark);
    }

    @Override
    public String toString() {
        return "StudentMark{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                ", aClass='" + aClass + '\'' +
                ", semester=" + semester +
                ", averageMark=" + averageMark +
                ", subjectMarks=" + Arrays.toString(subjectMarks) +
                '}';
    }
}
