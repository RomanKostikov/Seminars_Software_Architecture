package src.Application;

import src.Domain.MovieSearchRequest;
// клас обработки пользовательского ввода, передача его реализации(драйвер) интерфейса IUserInput
public class MovieUser {
    private src.Application.IUserInput userInputDriverPort;
    //в конструкторе передаем любую реализацию IUserInput и определяем ссылку в это private поле
    public MovieUser(src.Application.IUserInput userInputDriverPort) {
        this.userInputDriverPort = userInputDriverPort;
    }
    //обработка пользовательского поиска, передает объект поиска movieSearchRequest, а метод запускает
    //метод handleUserInput с этим параметром поиска у любого класса реализующего IUserInput
    //Это позволяет легко заменять или менять обработчики пользовательского ввода без изменения MovieUser.
    public void processInput(MovieSearchRequest movieSearchRequest)
    {
        userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}
