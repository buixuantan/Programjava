package MoviesManagement;

import java.util.ArrayList;

public class CustomList{

    private ArrayList<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        this.movies.add(movie);
        System.out.println("added "+movie);
    }

    public void removeMovie(Movie movie) {
        for (Movie movie1 : movies) {
            if (movie.name.equals(movie1.name)) {
                this.movies.remove(movie);
                System.out.println("deleted "+movie);
            } else {
                System.out.println("not find!");
            }
        }

    }

    public void printMovies() {
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
    }
}
