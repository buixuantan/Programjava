import java.util.ArrayList;
import java.util.Scanner;

public class News extends INews {

    ArrayList<News> newlist = new ArrayList<>();

    Day d = new Day();

    Scanner sc = new Scanner(System.in);

    public News(int id, String title, Day publishDate, String author, String content, float averageRate) {
        super(id, title, publishDate, author, content, averageRate);
    }

    public News() {
    }

    public News(Day publishDate) {
        super(publishDate);
    }

    public void insertNews(News news) {
        System.out.println("Enter title: ");
        news.title = sc.nextLine();
        System.out.println("Enter publish: ");
        Day d = new Day();
        news.publishDate = d.addDay();
        System.out.println("enter author's name: ");
        news.author = sc.nextLine();
        System.out.println("enter content: ");
        news.content = sc.nextLine();

        System.out.println("enter 3 rate element: ");
        Rate rate = new Rate();
        news.averageRate = rate.averageRate();
        newlist.add(news);

        System.out.println("added " + news);
    }

    public void viewNewsList() {
        for (News n : newlist) {
            System.out.println(n.toString());
        }
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
