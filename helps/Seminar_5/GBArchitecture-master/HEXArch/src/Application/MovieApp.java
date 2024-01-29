package src.Application;

import src.Domain.MovieReview;
import src.Domain.MovieSearchRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
// основной класс логики приложения

/**
 * Интерфейс Consumer обычно используется для представления операций над объектами определенного типа.
 * Он часто применяется в контексте потоков данных (stream) или для выполнения действий над элементами коллекций.
 *
 * Этот класс используется как потребитель запросов на поиск фильмов (MovieSearchRequest), и код обработки запросов передается в метод accept.
 * Когда объект MovieApp вызывается как Consumer, он выполняет логику обработки запросов, определенную внутри метода accept().
 */
public class MovieApp implements Consumer<MovieSearchRequest> {

    private IFetchMovieReviews fetchMovieReviews; // используем реализации интерфейсов для получения обзоров фильмов
    private IPrintMovieReviews printMovieReviews; // так-же реализации для вывода обзоров(рецензий)
    private static Random rand = new Random(); // обычный рандом

    // в конструктор передаем реализации интерфейсов
    public MovieApp(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        this.fetchMovieReviews = fetchMovieReviews;
        this.printMovieReviews = printMovieReviews;
    }

    // тут получаем случайные ревьюшки в количестве 5ти, если есть, и складываем в result
    private List<MovieReview> filterRandomReviews(List<MovieReview> movieReviewList) {
        List<MovieReview> result = new ArrayList<MovieReview>();
        // logic to return random reviews
        for (int index = 0; index < 5; ++index) {
            if (movieReviewList.size() < 1)
                break;
            int randomIndex = getRandomElement(movieReviewList.size());
            MovieReview movieReview = movieReviewList.get(randomIndex);
            movieReviewList.remove(movieReview);
            result.add(movieReview);
        }
        return result;
    }

    // рандомное число от 0 до size-1, обходим OutOfBoundsException в filterRandomReviews (по моему -)) )
    private int getRandomElement(int size) {
        return rand.nextInt(size);
    }

    // реализуем метод интерфейса Consumer, принимаем поисковый запрос
    public void accept(MovieSearchRequest movieSearchRequest) {
        List<MovieReview> movieReviewList = fetchMovieReviews.fetchMovieReviews(movieSearchRequest); // на основе поиска(поискового запроса) выбираем соответствующие ревью
        List<MovieReview> randomReviews = filterRandomReviews(new ArrayList<>(movieReviewList)); // из полученного списка обзоров выбираем 5 (если есть)
        printMovieReviews.writeMovieReviews(randomReviews); // и выводим их в консоль
    }
}
