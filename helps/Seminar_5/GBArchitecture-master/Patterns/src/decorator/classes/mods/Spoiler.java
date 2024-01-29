package decorator.classes.mods;

import decorator.abstracts.Car;
import decorator.abstracts.CarModification;

public class Spoiler extends CarModification {

    public Spoiler(Car car) {
        super(car);
    }

    @Override
    public void build() {
        car.build();
        addSpoiler();
    }

    private void addSpoiler(){
        System.out.println("Spoiler added");
    }
}
