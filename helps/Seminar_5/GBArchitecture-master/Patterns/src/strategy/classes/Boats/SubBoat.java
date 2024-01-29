package strategy.classes.Boats;

import strategy.abstracts.Boat;
import strategy.classes.DiveBehaviour;
import strategy.interfaces.iDiveable;

public class SubBoat extends Boat {
    public SubBoat() {
      super(new DiveBehaviour());
    }

}
