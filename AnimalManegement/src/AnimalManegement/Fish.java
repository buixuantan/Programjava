package AnimalManegement;

public class Fish extends Animal implements IMarineAnimal {

    public Fish() {
    }

    public Fish(int id, String name, int age) {
        super(id, name, age);
    }

    public Fish(int id) {
        super(id);
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void move() {
        System.out.println("fish is swimming");
    }
}
