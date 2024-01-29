package src.Adapters;

import src.Application.IFetchMovieReviews;
import src.Application.IPrintMovieReviews;
import src.Application.IUserInput;
import src.Application.MovieApp;
import src.Domain.Model;
import src.Domain.MovieSearchRequest;
// клас обработчик пользовательских команд и передача их в Model
public class UserCommand implements IUserInput {
    private Model model;

    //конструктор, при создании объекта передаем ему реализации интерфейсов фетча и принтера
    //которые используются для инициализации объекта movieApp, которым мы инициализируем нашу модель
    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    //реализация метода интерфейса, передаем команду юзера, приводим к типу (MovieSearchRequest) и отправляем в метод Run нашей модели
    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest)userCommand);
    }
}
