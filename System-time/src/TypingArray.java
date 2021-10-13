import java.util.Scanner;
public class TypingArray {
    public static void main(String[] args) {

        int size;
        int[] array;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(" Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        array = new int[size];

        int i = 0;
        while (i < array.length) {
            System.out.println(" Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Property list: ");
        for (int j = 0;j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int z = 0;z < array.length;z++) {
            if (max < array[z]) {
                max = array[z];
                index = z + 1;
            }
        }
        System.out.println("\nThe largest property value in the list is " + max + " ,at position " + index);

    }

}
