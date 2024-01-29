package domen;

import logic.data.ReportData;
import logic.data.UserData;
import logic.interfaces.iRepository;

import java.util.List;

public class DatabaseRepository implements iRepository {
    @Override
    public ReportData getReportById(int reportId) {
        // Реализация получения данных отчета из базы данных по идентификатору
        return reportData;
    }

    @Override
    public List<ReportData> getAllReports() {
        // Реализация получения всех данных отчетов из базы данных
        return listOfReports;
    }

    @Override
    public void saveReport(ReportData reportData) {
        // Реализация сохранения данных отчета в базу данных
    }

    @Override
    public void deleteReport(int reportId) {
        // Реализация удаления данных отчета из базы данных
    }

    @Override
    public UserData getUserById(int userId) {
        // Реализация получения данных пользователя из базы данных по идентификатору

        return userData;
    }
    // Другие методы доступа к данным пользователей и продуктов



}
