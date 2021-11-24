package AnimalManegement;

public class Cat extends Animal implements ITerrestralAnimal{

    public Cat() {
    }

    public Cat(int id, String name, int age) {
        super(id, name, age);
    }

    public Cat(int id) {
        super(id);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void move() {
        System.out.println("cat is running");
    }
}
