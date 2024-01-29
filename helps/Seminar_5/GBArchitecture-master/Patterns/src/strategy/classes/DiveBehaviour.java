package strategy.classes;

import strategy.interfaces.iDiveable;

public class DiveBehaviour implements iDiveable {
    @Override
    public void dive() {
        System.out.println("Все на дно! ДНООО!!!");
    }
}
