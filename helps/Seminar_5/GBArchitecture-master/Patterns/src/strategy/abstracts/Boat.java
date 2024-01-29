package strategy.abstracts;

import strategy.interfaces.iDiveable;

public class Boat {
    iDiveable diveable;

    public Boat(iDiveable diveable) {
        this.diveable = diveable;
    }

    void sway() {
    }

    ;

    void roll() {
    }

    ;

    public void performDive() {
        diveable.dive();
    }
}
