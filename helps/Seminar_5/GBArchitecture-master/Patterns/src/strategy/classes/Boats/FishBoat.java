package strategy.classes.Boats;

import strategy.abstracts.Boat;
import strategy.classes.NoDiveBehaviour;


public class FishBoat extends Boat {

    public FishBoat() {
        super(new NoDiveBehaviour());
    }

}
