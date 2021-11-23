package ZooManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    ArrayList<Cage> cageList; // = new ArrayList<>()

    int cageNumber;

    Scanner sc = new Scanner(System.in);

    public Zoo(ArrayList<Cage> cageList) {
        this.cageList = cageList;
    }

    public Zoo() {
        this.cageList = new ArrayList<Cage>();
    }

    public void addCage(Cage cage) {
        cage.cageNumber = ++cageNumber;
        cageList.add(cage);
        System.out.println("it had add cage number " + cageNumber + " in cage list");
    }

    public void removeCage(int cageNumber) {
        if(cageList.isEmpty()) {
            System.out.println("cage list is empty!");
        }else{
            boolean findOut = true;
            for (Cage cage : cageList) {
                if(cageNumber == cage.cageNumber) {
                    cageList.remove(cage);
                    System.out.println("Deleted " + cage +" cage list");
                    break;
                }
            }
            if(!findOut){
                System.out.println("dot found in " + cageNumber+ " in cage list!");
            }
        }
    }
}
