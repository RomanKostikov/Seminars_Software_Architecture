package src.Adapters;

import src.Application.IPrintMovieReviews;
import src.Domain.MovieReview;

import java.util.List;
//класс консольного принтера
public class ConsolePrinter implements IPrintMovieReviews {
    //реализуем метод интерфейса, через лямбду выводим каждый ревью из списка
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }
}
