package src.Application;

import src.Domain.MovieReview;
import src.Domain.MovieSearchRequest;

import java.util.List;
//интерфейс для предоставления ревью
public interface IFetchMovieReviews {
    //метод предназначенный для получения обзоров фильмов на основе запроса MovieSearchRequest.
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
