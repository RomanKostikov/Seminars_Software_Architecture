package src.Application;

import src.Domain.MovieReview;

import java.util.List;
//интерфейс консольного принтера для отображения пользователю
public interface IPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
