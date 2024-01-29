package src.strategy;

import strategy.abstracts.Boat;
import strategy.classes.Boats.FishBoat;
import strategy.classes.Boats.SubBoat;

public class Main {
    public static void main(String[] args) {
       Boat fishBoat = new FishBoat();
       fishBoat.performDive();

       Boat subBoat = new SubBoat();
       subBoat.performDive();
    }

}
