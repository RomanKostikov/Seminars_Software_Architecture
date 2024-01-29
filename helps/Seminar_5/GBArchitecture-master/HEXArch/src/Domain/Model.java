package src.Domain;

import src.Application.MovieApp;
// класс нашей модели (по MVC)
public class Model {

    private MovieApp movieApp;
    // в конструкторе получаем ссылку на MovieApp инициализируя модель, которая будет использоваться для выполнения операций над данными фильмов
    public Model(MovieApp movieApp) {
        this.movieApp = movieApp;
    }
    //тут передаем объект поиска(фильм) и вызываем accept в movieApp с этим объектом
    public void Run(MovieSearchRequest movieSearchRequest)
    {
        movieApp.accept(movieSearchRequest);
    }

}
