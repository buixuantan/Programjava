package AnimalManegement;

public class Crocodile extends Animal implements IMarineAnimal, ITerrestralAnimal{
    public Crocodile(int id, String name, int age) {
        super(id, name, age);
    }

    public Crocodile() {
    }

    public Crocodile(int id) {
        super(id);
    }

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Crocodile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void move() {
        System.out.println("crocodile is running");
    }

}
