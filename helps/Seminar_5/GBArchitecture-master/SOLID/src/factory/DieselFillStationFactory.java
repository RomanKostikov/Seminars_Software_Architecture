package factory;

import fillStrat.DieselFill;
import interfaces.iFillStation;
// дизельная фабрика
public class DieselFillStationFactory implements iFillStationFactory{
    @Override
    public iFillStation createFillStation() {
        return new DieselFill();
    }
}
