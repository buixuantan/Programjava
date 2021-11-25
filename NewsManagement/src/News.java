import java.util.ArrayList;
import java.util.Scanner;

public class News extends INews {

    ArrayList<News> news = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public News(int id, String title, Day publishDate, String author, String content, Rate averageRate) {
        super(id, title, publishDate, author, content, averageRate);
    }

    public News() {
    }

    public News(Day publishDate) {
        super(publishDate);
    }

//    public void insertNews(News news) {
//        System.out.println("Enter title: ");
//        news.title = sc.nextLine();
//        System.out.println("Enter publish date: ");
//
//
//        Day day = new Day();
//        System.out.println("Enter day: ");
//        day.day = sc.nextInt();
//        System.out.println("Enter month: ");
//        day.month = sc.nextInt();
//        System.out.println("Enter year: ");
//        day.year = sc.nextInt();
//        day = new Day(day.day, day.month, day.year);
//
//        System.out.println("Enter author's name: ");
//        news.author = sc.nextLine();
//        System.out.println("Enter content: ");
//        news.content = sc.nextLine();

    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", averageRate=" + averageRate +
                '}';
    }
}
