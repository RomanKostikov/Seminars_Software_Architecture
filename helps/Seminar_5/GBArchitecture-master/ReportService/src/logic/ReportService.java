package logic;

import logic.data.ReportData;
import logic.data.ReportParameters;
import logic.interfaces.iRepository;

public class ReportService {
    private iRepository reportRepository;

    public ReportService(iRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public void generateReport(int reportId, ReportParameters parameters) {
        // Получить данные отчета из репозитория
        ReportData reportData = reportRepository.getReportById(reportId);

        // Обработать данные отчета для создания отчета с заданными параметрами
        // ...

        // Сохранить обновленные данные обратно в репозиторий
        reportRepository.saveReport(reportData);
    }

    // Другие методы логики для работы с отчетами и другими данными
}
