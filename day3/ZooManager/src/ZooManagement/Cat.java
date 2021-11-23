package ZooManagement;

public class Cat extends Animal{
    @Override
    public void speak() {
        System.out.println("meo meo");
    }

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, String description) {
        super(name, age, description);
    }
}
