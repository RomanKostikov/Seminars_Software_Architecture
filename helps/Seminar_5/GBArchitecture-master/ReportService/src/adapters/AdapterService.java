package adapters;

import logic.interfaces.iAdapterService;

public class AdapterService implements iAdapterService {
    @Override
    public void connectToExternalSystem() {
        // Реализация подключения к внешней системе
    }

    @Override
    public void formatDataForUser() {
        // Реализация форматирования данных для пользователя
    }

    @Override
    public void sendDataToServiceLayer() {
        // Реализация отправки данных в слой сервисов
    }
}
