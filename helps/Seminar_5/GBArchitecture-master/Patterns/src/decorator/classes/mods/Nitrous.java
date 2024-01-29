package decorator.classes.mods;

import decorator.abstracts.Car;
import decorator.abstracts.CarModification;

public class Nitrous extends CarModification {

    public Nitrous(Car car) {
        super(car);
    }

    @Override
    public void build() {
        car.build();
        addNitrous();
    }

    private void addNitrous() {
        System.out.println("Nitrous added ");
    }
}
