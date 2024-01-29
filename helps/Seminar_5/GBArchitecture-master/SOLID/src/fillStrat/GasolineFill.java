package fillStrat;

import interfaces.iFillStation;
//реализации заправки автомобиля от типа топлива FuelType fuelType
public class GasolineFill implements iFillStation {

    @Override
    public void fill() {
        System.out.println("Заправляем бензином");
    }
}
