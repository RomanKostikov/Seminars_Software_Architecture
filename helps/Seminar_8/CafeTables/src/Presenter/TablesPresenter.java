package Presenter;

import Model.TablesModel;
import Model.interfaces.ITablesModel;
import Presenter.interfaces.ITablePresenter;
import View.interfaces.ITablesView;

public class TablesPresenter implements ITablePresenter {
    private final ITablesView view;
    private final ITablesModel model;

    public TablesPresenter(ITablesView view) {
        this.view = view;
        this.model = new TablesModel();
    }
    @Override
    public boolean onTableSelected(int hallNumber, int tableNumber) {
        boolean success = model.bookTable(hallNumber, tableNumber);
        if (success) {
            view.showSuccessMessage("Table booked successfully!");
            updateTablesStatus();
        } else {
            view.showErrorMessage("Table is already booked!");
        }
        return success;
    }
    @Override
    public boolean onTableReleased(int hallNumber, int tableNumber) {
        boolean success = model.releaseTable(hallNumber, tableNumber);
        if (success) {
            view.showSuccessMessage("Table released successfully!");
            updateTablesStatus();
        } else {
            view.showErrorMessage("Table is already vacant!");
        }
        return success;
    }
    @Override
    public void updateTablesStatus() {
        String[][] tablesStatus = model.getTablesStatus();
        view.showTablesStatus(tablesStatus);
    }

}
