package decorator.classes;

import decorator.abstracts.Car;

public class Ford extends Car {
    @Override
    public void build() {
        System.out.println("Ford build");
    }
}
