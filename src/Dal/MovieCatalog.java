package Dal;

import java.util.ArrayList;
import java.util.List;

import DTO.Movie;

public class MovieCatalog {
    private List<Movie> movies;

    public MovieCatalog() {
        // Initialize movies (you can load them from a database or file)
    	//lets assume we dont have any file or database
        this.movies = new ArrayList<>();
        initializeMovies(); // Call the method to add movies
    }

    public void displayMovies() {
    	int counter =1;
        System.out.println("Available Movies :");
        for (Movie movie : movies) {
            System.out.println((counter++)+" | "+movie.getTitle());
        }
    }

    public Movie selectMovie(int index) {
        if (index >= 0 && index < movies.size()) {
            return movies.get(index);
        } else {
            System.out.println("Invalid movie selection.");
            return null;
        }
    }

    private void initializeMovies() {
        movies.add(new Movie("Movie 1"));
        movies.add(new Movie("Movie 2"));
        movies.add(new Movie("Movie 3"));
        movies.add(new Movie("Movie 4"));
        movies.add(new Movie("Movie 5"));
        movies.add(new Movie("Movie 6"));
        movies.add(new Movie("Movie 7"));
        movies.add(new Movie("Movie 8"));
        movies.add(new Movie("Movie 9"));
        // Add more movies as needed
    }
}
