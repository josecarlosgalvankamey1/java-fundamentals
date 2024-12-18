import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Movie> movies;

    public Store() {
        movies = new ArrayList<>();
    }

    public Movie getMovie(int index) {
        return this.movies.get(index);
    }

    public void setMovie(int index, Movie movie) {
        this.movies.set(index, movie);
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}