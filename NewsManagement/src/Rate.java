import java.util.Scanner;

public class Rate {
    int[] rate;
    float average;

    public Rate() {
    }

    public Rate(int[] rate) {
        this.rate = rate;
    }

    public float averageRate() {

        Scanner sc = new Scanner(System.in);

        int[] rate = new int[3];
        for (int i = 0; i < rate.length; i++) {
            System.out.println("Enter index " + i);
            rate[i] = sc.nextInt();
        }
        average = (rate[0] + rate[1] + rate[2])/3;

        return average;
    }

}
