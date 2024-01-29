package decorator.abstracts;

public abstract class CarModification extends Car{
    public Car car;
    public CarModification(Car car) {
        this.car = car;
    }
}
