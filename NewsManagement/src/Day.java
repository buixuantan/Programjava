import java.util.ArrayList;
import java.util.Scanner;

public class Day {
    int day;
    int month;
    int year;

    ArrayList<Day> days = new ArrayList<>();
//    Scanner sc = new Scanner(System.in);

    public Day() {
    }

    public Day(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Day addDay() {
        Scanner sc = new Scanner(System.in);
        Day d = new Day();
        System.out.println("enter day: ");
        d.day = sc.nextInt();
        System.out.println("enter month: ");
        d.month = sc.nextInt();
        System.out.println("enter year: ");
        d.year = sc.nextInt();
        return d;
    }

}
