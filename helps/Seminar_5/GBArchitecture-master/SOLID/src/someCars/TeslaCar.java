package someCars;

import abstracts.aCar;
import enumsFuelType.FuelType;
import factory.iFillStationFactory;
import fillStrat.DieselFill;
import fillStrat.ElectricFill;
import fillStrat.GasolineFill;
import interfaces.iFillStation;

/*
класс конкретного автомобиля наследуемого от aCar
 */
public class TeslaCar extends aCar implements iFillStation {
    private iFillStation fillType;

    /**
     * конструктор реализации через свичи и тип (типо стратегия :-) )
     *
     * @param fuelType - задаем тип топлива из num FuelType
     */
    public TeslaCar(String brand, String model, String color, String bodyType, int numberOfWheels, FuelType fuelType, String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, fuelType, transmissionType, engineVolume);

        switch (fuelType) {
            case ELECTRIC -> fillType = new ElectricFill();
            case DIESEL -> fillType = new DieselFill();
            case GASOLINE -> fillType = new GasolineFill();
            default -> throw new IllegalArgumentException("Unknown fuel type: " + fuelType);
        }
    }

    /**
     * замена, на уже реализованных классах
     *
     * @param fuelType новый тип топлива
     */
    @Override
    public void setFuelType(FuelType fuelType) {
        super.setFuelType(fuelType);
        switch (fuelType) {
            case ELECTRIC -> {
                if (!(fillType instanceof ElectricFill)) {
                    fillType = new ElectricFill();
                }
            }
            case DIESEL -> {
                if (!(fillType instanceof DieselFill)) {
                    fillType = new DieselFill();
                }
            }
            case GASOLINE -> {
                if (!(fillType instanceof GasolineFill)) {
                    fillType = new GasolineFill();
                }
            }
            default -> throw new IllegalArgumentException("Unknown fuel type: " + fuelType);
        }
    }

    /**
     * конструктор для реализации через фабрику
     *
     * @param fillStationFactory указываем нужную нам фабрику
     * @param fuelType           при рефакторинге и выборе реализации можно удалить или изменить тип, к примеру на String
     */
    public TeslaCar(String brand, String model, String color, String bodyType, int numberOfWheels, FuelType fuelType, String transmissionType, double engineVolume, iFillStationFactory fillStationFactory) {
        super(brand, model, color, bodyType, numberOfWheels, fuelType, transmissionType, engineVolume);
        // переменная для фабрик
        this.fillType = fillStationFactory.createFillStation();
    }

    /**
     * замена, на уже реализованных классах
     *
     * @param fillStationFactory новый тип фабрики
     */
    public void setFillStationFactory(iFillStationFactory fillStationFactory) {
        this.fillType = fillStationFactory.createFillStation();
    }

    //реализация родительских методов
    @Override
    public void move() {
        //some realization
    }

    @Override
    public void service() {
        //some realization
    }

    @Override
    public void shiftGears() {
        //some realization
    }

    @Override
    public void turnOnLights() {
        //some realization
    }

    @Override
    public void turnOnWipers() {
        //some realization
    }


    // метод заправки
    @Override
    public void fill() {
        fillType.fill();
    }

}

