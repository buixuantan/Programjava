package MoviesManagement;

import java.text.DateFormat;
import java.util.Scanner;

public class Movie extends AbstractMovie {

    double[] rateList = new double[3];

    public Movie() {
    }

    public Movie(int id, String name, String publishDate, String director, String subtitle, float averageRate) {
        super(id, name, publishDate, director, subtitle, averageRate);
    }

    public double[] indexerRate() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rateList.length; i++) {
            System.out.println("enter index "+ i);
            rateList[i] = sc.nextDouble();
        }
        return rateList;
    }

    public double aveCal(double[] arr) {
        double sum = 0;
        for (int i=0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum/arr.length;
        return average;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", publishDate=" + publishDate +
                ", director='" + director + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", averageRate=" + averageRate +
                '}';
    }

}
