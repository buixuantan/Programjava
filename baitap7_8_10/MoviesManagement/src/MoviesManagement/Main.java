package MoviesManagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie movie = new Movie();
        CustomList customList = new CustomList();
        int option = 0;
        do {
            System.out.println("---MENU OPTION---");
            System.out.println("1. insert new movie \n" +
                    "2. view list of movie \n" +
                    "3. sort movie by average list \n" +
                    "4. delete a movie \n" +
                    "5. exit.");

            option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.println("enter id: ");
                movie.id = sc.nextInt();
                sc.nextLine();
                System.out.println("enter film's name: ");
                movie.name = sc.nextLine();
                System.out.println("enter publish date: ");
                movie.publishDate = sc.nextLine();
                System.out.println("enter director's name: ");
                movie.director = sc.nextLine();
                System.out.println("enter language of film: ");
                movie.subtitle = sc.nextLine();
                System.out.println("enter 3 rate points: ");
                movie.averageRate = movie.aveCal(movie.indexerRate());

                customList.addMovie(movie);
            }
            if (option == 2) {
                customList.printMovies();
            }

            if (option == 3) {
                System.out.println("not complete!");
            }

            if (option == 4) {
                System.out.println("enter film's name to delete: ");
                movie.name = sc.nextLine();
                customList.removeMovie(movie);
            }


        } while (option != 0);
    }
}
