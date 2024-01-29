package src.Adapters;

import src.Application.IFetchMovieReviews;
import src.Domain.MovieReview;
import src.Domain.MovieSearchRequest;

import java.util.*;
//класс репозиторий для ревьюшек
public class MovieReviewsRepo implements IFetchMovieReviews {
    private Map<String, List<MovieReview>> movieReviewMap; //мапа <название фильма, ревью к этому фильму(из листа)>

    public MovieReviewsRepo() {  //конструктор инициализатор, как только создается объект класса, мапа заполняется отзывами
        initialize();
    }

    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) { // реализация метода из интерфейса, принимаем запрос фильма и ищем отзывы в нашей мапе по названию фильма

        return Optional.ofNullable(movieReviewMap.get(movieSearchRequest.getMovieName())) // если фильмов нет Optional вернет пустой список new ArrayList
                .orElse(new ArrayList<>());
    }

    private void initialize() { // начальный инициализатор для заполнения мапы обзоров p.s. StarTreck пишется без с - исправил
        this.movieReviewMap = new HashMap<>();
        movieReviewMap.put("StarWars", Collections.singletonList(new MovieReview("1", 7.5, "Good"))); // неизменяемый список из одного элемента (думаю для создания списка "только для чтения", или кто-то не хочет менять свое мнение -)) ) -(может выплюнуть UnsupportedOperationException.)
        movieReviewMap.put("StarTrek", Arrays.asList(new MovieReview("1", 9.5, "Excellent"), new MovieReview("1", 8.5, "Good")));
    }
}
