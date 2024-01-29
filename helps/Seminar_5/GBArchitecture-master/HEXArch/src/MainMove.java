package src;

import src.Adapters.ConsolePrinter;
import src.Adapters.MovieReviewsRepo;
import src.Adapters.UserCommand;
import src.Application.IFetchMovieReviews;
import src.Application.IPrintMovieReviews;
import src.Application.IUserInput;
import src.Application.MovieUser;
import src.Domain.MovieSearchRequest;

public class MainMove {
    public static void main(String[] args) {

        IFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo(); // создаем репу ревьюх
        IPrintMovieReviews printMovieReviews = new ConsolePrinter(); // создаем консольный вывод
        IUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews); // реализация команды на поиск

        MovieUser movieUser = new MovieUser(userCommand); // реализация обработки команды на поиск
        MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars"); //сам поиск по фильму - StarWars
        MovieSearchRequest starTrekRequest = new MovieSearchRequest("StarTrek"); // ~~~~~~~~~~~~~~~~~~ - StarTrek

        // вывод результатов поиска в консоль
        System.out.println("Displaying reviews for movie " + starTrekRequest.getMovieName());
        movieUser.processInput(starTrekRequest);
        System.out.println("Displaying reviews for movie " + starWarsRequest.getMovieName());
        movieUser.processInput(starWarsRequest);
    }
}