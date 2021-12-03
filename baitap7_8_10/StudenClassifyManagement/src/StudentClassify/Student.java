package StudentClassify;

public class Student {
    static int count;
    int id;
    String name;
    String aClass;
    float math;
    float physic;
    float chemistry;

    public Student() {
    }

    public Student(int id, String name, String aClass, float math, float physic, float chemistry) {
        this.id = id;
        this.name = name;
        this.aClass = aClass;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getPhysic() {
        return physic;
    }

    public void setPhysic(float physic) {
        this.physic = physic;
    }

    public float getChemistry() {
        return chemistry;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", aClass='" + aClass + '\'' +
                ", math=" + math +
                ", physic=" + physic +
                ", chemistry=" + chemistry +
                '}';
    }

    public String display() {
        return "Student{" +
                "name='" + name + '\'' +
                ", average=" + (math + physic + chemistry)/3 +
                '}';
    }
}
