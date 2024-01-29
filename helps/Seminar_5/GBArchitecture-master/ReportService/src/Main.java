import adapters.AdapterService;
import domen.DatabaseRepository;
import logic.ReportService;

public class Main {
    public static void main(String[] args) {
        // слишком абстрактно -((      (проще писать когда есть конкретика)
        AdapterService adapterService = new AdapterService();
        DatabaseRepository repository = new DatabaseRepository();
        ReportService reportService = new ReportService(repository);
        System.out.println("Report Service");
    }
}