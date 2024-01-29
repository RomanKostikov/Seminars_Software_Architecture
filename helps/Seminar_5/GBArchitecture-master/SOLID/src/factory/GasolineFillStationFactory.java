package factory;

import fillStrat.GasolineFill;
import interfaces.iFillStation;
//бензиновая фабрика
public class GasolineFillStationFactory implements iFillStationFactory {
    @Override
    public iFillStation createFillStation() {
        return new GasolineFill();
    }
}
