public class Rate {
    int[] rate;
    float averageRate;

    public Rate(int[] rate) {
        this.rate = rate;
    }

    public void averageRate(int[] rate) {
        rate = new int[3];
        float average = (rate[0] + rate[1] + rate[3])/3;
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] rateList = new int[3];
//        int i;
//        System.out.println("rate list has size of 3 elements: ");
//        for (i = 0; i < rateList.length; i++) {
//            System.out.println("enter a value at index " + i);
//            rateList[i] = sc.nextInt();
//
//        }
//        System.out.print("the rate list include: ");
//        for (int j = 0; j < rateList.length; j++) {
//            System.out.print(rateList[j] + ", ");
//        }
//    }
}
