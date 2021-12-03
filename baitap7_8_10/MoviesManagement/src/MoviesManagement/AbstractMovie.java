package MoviesManagement;

public abstract class AbstractMovie {
    int id;
    String name;
    // DateFormat publishDate;
    String publishDate;
    String director;
    String subtitle;
    double averageRate;

    public AbstractMovie() {
    }

    public AbstractMovie(int id, String name, String publishDate, String director, String subtitle, float averageRate) {
        this.id = id;
        this.name = name;
        this.publishDate = publishDate;
        this.director = director;
        this.subtitle = subtitle;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(float averageRate) {
        this.averageRate = averageRate;
    }
}
