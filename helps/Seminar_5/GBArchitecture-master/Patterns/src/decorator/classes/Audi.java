package decorator.classes;

import decorator.abstracts.Car;

public class Audi extends Car {
    @Override
    public void build() {
        System.out.println("Audi build");
    }
}
