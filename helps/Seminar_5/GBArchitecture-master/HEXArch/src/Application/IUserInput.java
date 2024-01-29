package src.Application;
// интерфейс обработки пользовательских команд
public interface IUserInput {
    public void handleUserInput(Object userCommand); // Object - принимаем запросы любого типа
}
