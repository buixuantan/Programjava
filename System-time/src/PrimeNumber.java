import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int listPrime;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of primes to print: ");
        listPrime = input.nextInt();

        printListPrimeNumber(listPrime);

    }

//    public static void printListPrimeNumber(int listPrime) {
//        int count = 0;
//        int N = 2;
//        for (int i = 0; count <= listPrime; i++) {
//            for (int j = 2; j < N; j++) {
//                if (N%j != 0) {
//                    System.out.println(N + ",");
//                    N += 1;
//                }
//            }
//            count += 1;
//        }
//    }

    public static void printListPrimeNumber(int listPrime) {
        boolean check = true;
        int N = 2;
        for (int i = 0; i <= listPrime; i++) {
            for (int j = 2; j < N; j++) {
                if (N % j == 0) {
                    check = false;
                    break;
                }

            }
            if (check) {
                System.out.print(N + ", ");
            }
            check = true;
            N += 1;

        }


    }


}
