package AnimalManegement;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalProduction {
    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList<ITerrestralAnimal> iTerrestralAnimals = new ArrayList<>();
    ArrayList<IMarineAnimal> iMarineAnimals = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addCat(Animal a) {
        System.out.println("Enter cat's id: ");
        a.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter cat's name: ");
        a.name = sc.nextLine();
        System.out.println("Enter cat's age: ");
        a.age = sc.nextInt();

        animals.add(a);  // thêm con vật thuộc kiểu Animal vào ArrayList.

        System.out.println("added a " + a + "success");
    }

    public void addFish(Animal a) {
        System.out.println("Enter fish's id: ");
        a.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter fish's name: ");
        a.name = sc.nextLine();
        System.out.println("Enter fish's age: ");
        a.age = sc.nextInt();

        animals.add(a);  // thêm con vật thuộc kiểu Animal vào ArrayList.

        System.out.println("added a " + a + "success");
    }

    public void addCrocodile(Animal a) {
        System.out.println("Enter crocodile's id: ");
        a.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter crocodile's name: ");
        a.name = sc.nextLine();
        System.out.println("Enter crocodile's age: ");
        a.age = sc.nextInt();

        animals.add(a);  // thêm con vật thuộc kiểu Animal vào ArrayList.

        System.out.println("added a " + a + "success");
    }

    public void viewTerrestrialAnimal (ITerrestralAnimal iTerrestralAnimal) {
        for (ITerrestralAnimal t : iTerrestralAnimals) {
            if (iTerrestralAnimal.equals(t)) {
                iTerrestralAnimal.move();
                iTerrestralAnimal.toString();
            }
        }
    }

    public  void viewMarineAnimal (IMarineAnimal iMarineAnimal) {
        for (IMarineAnimal m : iMarineAnimals ) {
            if (iMarineAnimal.equals(m)) {
                iMarineAnimal.toString();
                iMarineAnimal.move();
            }
        }
    }

    public  void viewAllAnimal (Animal animal) {
        for (Animal a : animals) {
            if (animal.equals(a)) {
                animal.toString();
                animal.move();
            }
        }
    }

    public void remoAllAnimal() {
        animals.removeAll(animals);
        System.out.println("deleted all animal in list!");
    }

}
