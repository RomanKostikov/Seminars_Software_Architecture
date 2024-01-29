package decorator;

import decorator.abstracts.Car;
import decorator.classes.Audi;
import decorator.classes.mods.Nitrous;
import decorator.classes.mods.Spoiler;

public class Main {
    public static void main(String[] args) {
        Car audi = new Audi();
        Car audiWithSpoiler = new Spoiler(audi);
        audiWithSpoiler.build();

        System.out.println();

        Car audiWithMods = new Nitrous(audiWithSpoiler);
        audiWithMods.build();
    }
}
