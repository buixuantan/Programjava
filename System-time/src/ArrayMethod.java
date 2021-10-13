public class ArrayMethod {
    public static void main(String[] args) {
        int[] array = {10 , 3, 4, 5, 6, 9};
        int index = minValue(array);
        System.out.println(" The smallest element in th array is " + array[index] + " at " + index);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
