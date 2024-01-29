package fillStrat;

import interfaces.iFillStation;
//реализации заправки автомобиля от типа топлива FuelType fuelType
public class DieselFill implements iFillStation {
    @Override
    public void fill() {
        System.out.println("Заправляем дизелем");
    }
}
