import enumsFuelType.FuelType;
import factory.DieselFillStationFactory;
import factory.ElectricFillStationFactory;
import factory.GasolineFillStationFactory;
import someCars.TeslaCar;

public class Main {
    public static void main(String[] args) {
        // реализация через тип и свичи
        TeslaCar teslaA1 = new TeslaCar("Tesla", "A1", "Red", "cope", 4, FuelType.DIESEL, "auto", 2.5);
        System.out.println(teslaA1.toString());
        teslaA1.fill();
        System.out.println();
        teslaA1.setFuelType(FuelType.ELECTRIC); // меняем тип на электро
        System.out.println(teslaA1.toString());
        teslaA1.fill();
        System.out.println();

        // реализация через фабрику
        TeslaCar teslaFb1 = new TeslaCar("Tesla", "FB1", "Blue", "cope", 4, FuelType.GASOLINE, "auto", 2.5, new GasolineFillStationFactory());
        System.out.println(teslaFb1.toString());
        teslaFb1.fill();
        System.out.println();
        teslaFb1.setFillStationFactory(new ElectricFillStationFactory()); // меняем на зарядку
        teslaFb1.fill();
        System.out.println();
    }
}
