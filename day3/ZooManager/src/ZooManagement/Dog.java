package ZooManagement;

public class Dog extends Animal{

    @Override
    public void speak() {
        System.out.println("gâu gâu");
    }

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name, int age, String description) {
        super(name, age, description);
    }
}
