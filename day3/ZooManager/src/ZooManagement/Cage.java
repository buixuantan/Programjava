package ZooManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Cage {
    int cageNumber;
    ArrayList<Animal> animalList; // = new ArrayList<>()

    public Cage(int cageNumber) {
        this.cageNumber = cageNumber;
    }

    public Cage() {
        this.animalList = new ArrayList<Animal>();
    }

    public Cage(int cageNumber, ArrayList<Animal> animalList) {
        this.cageNumber = cageNumber;
        this.animalList = animalList;
    }

    public void addAnimal(Animal a) {
        Scanner sc = new Scanner(System.in);
        boolean sampleName = false;

        do{
            System.out.println("Enter animal type to add in animal list: ");
            a.name = sc.nextLine();

            for(Animal an: animalList) {
                if (a.name.equals(an.name)) {
                    sampleName = true;
                    System.out.println("this animal type have exist in zoo. please reenter!");
                    break;
                }
            }
        }while (a.name.length() == 0 || sampleName == true );

        do{
            System.out.println("Enter animal age to add in animal list: ");
            a.age = sc.nextInt();
        } while (a.age < 0);

        do {
            System.out.println("Enter description for animal: ");
            a.description = sc.nextLine();
        }while (a.description.length() == 0);

        this.animalList.add(a); // them con vat vao danh sách động vật
    }

    public void removeAnimal(String name) {
        if(animalList.isEmpty()){
            System.out.println("Cage has cageNumber " + cageNumber + "not yet animal!" );
        } else {
            boolean findOut = false;
            for (Animal an : animalList) {
                if (name.equals(an.name)) {
                    animalList.remove(an);
                    System.out.println("Deleted " + name + " in Cage");
                    break;
                }
            }
            if (!findOut){
                System.out.println("not find uot" + name + " in cage!");
            }
        }
        this.animalList.remove(name); // xoá con vât khỏi chuồng

    }
}
