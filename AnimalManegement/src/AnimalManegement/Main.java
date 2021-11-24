package AnimalManegement;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AnimalProduction animalProduction = new AnimalProduction();
        Crocodile crocodile = new Crocodile();
        Cat cat = new Cat();
        Fish fish = new Fish();

        int choice = 8;

        do {
            System.out.println("--------MENU OF ANIMAL--------");
            System.out.println("1. create a crocodile\n" +
                    "2. create a cat\n" +
                    "3. create a fish\n" +
                    "4. view terrestrial\n" +
                    "5. view marine animal\n" +
                    "6. view all animal\n" +
                    "7. delete animal\n" +
                    "8. exit");
            System.out.println("Enter your option: ");
            choice = sc.nextInt();

            if (choice == 1) {
                animalProduction.addCrocodile(crocodile);
            }

            if (choice == 2) {
                animalProduction.addCat(cat);
            }

            if (choice == 3) {
                animalProduction.addFish(fish);
            }

            if (choice == 4) {
                animalProduction.viewTerrestrialAnimal(cat);
                animalProduction.viewTerrestrialAnimal(crocodile);
            }

            if (choice == 5) {
                animalProduction.viewMarineAnimal(fish);
                animalProduction.viewMarineAnimal(crocodile);
            }

            if (choice == 6) {
                animalProduction.viewAllAnimal(crocodile);
                animalProduction.viewAllAnimal(cat);
                animalProduction.viewAllAnimal(fish);
            }

            if (choice == 7) {
                animalProduction.remoAllAnimal();
            }

        } while (choice != 8);

    }
}
