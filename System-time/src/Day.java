import java.util.Scanner;
public class Day {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Which  month that you want to count days?");
        int month = scanner.nextInt();

        String daysInMonth =  getDaysInMonth(month);
        System.out.println(daysInMonth);
        // tham số month của hàm được gọi là đối số của hàm 'getDayOfMonth' có tham số là 'int month'

    }

    public static String getDaysInMonth(int month){
        String daysInMonth;
        // tham số 'int month' là biến được đặt bằng 'scanner.nextInt()
        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = null;
        }
        return daysInMonth;

    }
}
