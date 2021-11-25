public abstract class INews {
    int id;
    String title;
    Day publishDate;
    String author;
    String content;
    Rate averageRate; // read only property - chưa hiểu.

    public INews() {
    }

    public INews(Day publishDate) {
        this.publishDate = publishDate;
    }

    public INews(int id, String title, Day publishDate, String author, String content, Rate averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Day getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Day publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Rate getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(Rate averageRate) {
        this.averageRate = averageRate;
    }

    @Override
    public String toString() {
        return "INews{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", averageRate=" + averageRate +
                '}';
    }
}
