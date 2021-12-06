package StudentManagement;

import java.text.DateFormat;
import java.util.Date;

public class Student{

    String name;
    int id;
    Date dateOfBirth;
    String country;
    String aClass;
    String phoneNo;
    int mobile;

    public Student() {
    }

    public Student(String name, int id, Date dateOfBirth, String country, String aClass, String phoneNo, int mobile) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.aClass = aClass;
        this.phoneNo = phoneNo;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", country='" + country + '\'' +
                ", aClass='" + aClass + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
