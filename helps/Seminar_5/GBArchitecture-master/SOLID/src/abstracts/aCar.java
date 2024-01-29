package abstracts;

import enumsFuelType.FuelType;

/**
 * Спроектировать абстрактный класс «Car» у которого должны быть свойства: марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя;
 * методы: движение, обслуживание, переключение передач, включение фар, включение дворников. *
 */

public abstract class aCar {
    private String brand;
    private String model;
    private String color;
    private String bodyType;
    private int numberOfWheels;
    private FuelType fuelType;
    private String transmissionType;
    private double engineVolume;

    /**
     * Конструктор класса aCar.
     *
     * @param brand             марка автомобиля
     * @param model             модель автомобиля
     * @param color             цвет автомобиля
     * @param bodyType          тип кузова автомобиля
     * @param numberOfWheels    количество колес
     * @param fuelType          тип топлива
     * @param transmissionType  тип коробки передач
     * @param engineVolume      объем двигателя
     */
    public aCar(String brand, String model, String color, String bodyType, int numberOfWheels, FuelType fuelType, String transmissionType, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineVolume = engineVolume;
    }

    /**
     * Метод для движения автомобиля.
     */
    public abstract void move();

    /**
     * Метод для обслуживания автомобиля.
     */
    public abstract void service();

    /**
     * Метод для переключения передач автомобиля.
     */
    public abstract void shiftGears();

    /**
     * Метод для включения фар автомобиля.
     */
    public abstract void turnOnLights();

    /**
     * Метод для включения дворников автомобиля.
     */
    public abstract void turnOnWipers();

    /**
     * Сеттер для замены типа топлива у автомобиля.
     *
     * @param fuelType новый тип топлива
     */
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "aCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", fuelType=" + fuelType +
                ", transmissionType='" + transmissionType + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
