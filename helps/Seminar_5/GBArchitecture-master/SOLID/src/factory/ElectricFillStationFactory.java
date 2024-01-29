package factory;

import fillStrat.ElectricFill;
import interfaces.iFillStation;
//электро фабрика
public class ElectricFillStationFactory implements iFillStationFactory {
    @Override
    public iFillStation createFillStation() {
        return new ElectricFill();
    }
}
