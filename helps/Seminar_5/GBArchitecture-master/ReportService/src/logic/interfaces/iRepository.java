package logic.interfaces;

import logic.data.ReportData;
import logic.data.UserData;

import java.util.List;

public interface iRepository {
    ReportData getReportById(int reportId);
    List<ReportData> getAllReports();
    void saveReport(ReportData reportData);
    void deleteReport(int reportId);
    UserData getUserById(int userId);

    // можно добавить здесь другие методы для доступа к данным пользователей и продуктов
}
