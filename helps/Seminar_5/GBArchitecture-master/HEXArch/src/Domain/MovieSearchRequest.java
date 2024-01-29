package src.Domain;
// класс объекта поиска
public class MovieSearchRequest {
    String request;
    // в конструкторе передаем название фильма для поиска
    public MovieSearchRequest(String name) {
        this.request = name;
    }
    //гетер для поля request
    public String getMovieName() {
        return request;
    }
}
