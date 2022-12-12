import java.util.*;
class Movie
{ static String title, director;
    static double rating;
    public Movie(double r) {
        title = "Wakanda Forever";
        director = "Ryan Coolger";
        rating = r;
    }
    public void getRating(Movie movies[]) {
        for(Movie movie: movies) {
            if(movie.rating > 3)
                System.out.println(movie.title);
        }
    }
    public static Movie[] movieUpperCase(Movie movies[])
    {
        for(Movie movie: movies)
            movie.title = movie.title.toUpperCase();
        return movies;
    }
    public static void sortByDirector(Movie movies[])
    {
        Arrays.sort(movies, new Comparator<Movie>()
        {
            public int compare(Movie m1, Movie m2)
            {
                return m1.director.compareTo(m2.director);
            }
        });
        printMovies(movies);
    }
    public static void printMovies(Movie[] movies) {
        for(Movie movie: movies)
            System.out.println(movie.title);
    }
}
public class B5{
    public static void main (String[] args) {
        Movie[] movie = { new Movie(4), new Movie(4.7), new Movie(4.9), new Movie(2.3)};
        Movie m1 = new Movie(4);
        Movie.printMovies(movie);
        Movie.movieUpperCase(movie);
        m1.getRating(movie);
        Movie.sortByDirector(movie);
    }
}