import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = scanner.nextInt();
        boolean root = isNumberPrime(number);
        if (root)
            System.out.print("prime");
            else
                System.out.print("not prime");


    }

    public static boolean isNumberPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) ;
            return false;
        }
        return true;
    }
}
