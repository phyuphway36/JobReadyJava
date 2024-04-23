package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MoviePredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Movie> movies = Arrays.asList(
				new Movie("title1","Horror"),
				new Movie("title2","Horror"),
				new Movie("title3","Horror"),
				new Movie("title4","Drama"),
				new Movie("title5","Drama"),
				new Movie("title6","Drama"),
				new Movie("title7","Action"),
				new Movie("title8","Action"),
				new Movie("title9","Action")
				
				);
				
		Predicate<Movie> horrorGenre = m -> m.getGenre().contains("Horror");
		Predicate<Movie> dramaGenre = m -> m.getGenre().contains("Drama");
		Predicate<Movie> actionGenre = m -> m.getGenre().contains("Action");
		
		List<Movie> filteredMovies =filterMovie(movies, dramaGenre);
		filteredMovies.forEach(m -> System.out.println(m));
	}

	static List<Movie> filterMovie(List<Movie> movies,Predicate<Movie> movieFilter){
		List<Movie> filteredMovies = new ArrayList<>();
		
		for(Movie movie : movies) {
			if(movieFilter.test(movie))
				filteredMovies.add(movie);
		}
		return filteredMovies;
	}
}
