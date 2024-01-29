package strategy.classes;

import strategy.interfaces.iDiveable;

public class NoDiveBehaviour implements iDiveable {
    @Override
    public void dive() {
        System.out.println("No no no");
    }
}
