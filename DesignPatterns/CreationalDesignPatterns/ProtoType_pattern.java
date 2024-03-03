

interface Prototype {
    Car clone();
}

class Car implements Prototype {
    private String brand;
    private String series;
    private int ID;

    Car(Car car) {
        this.brand = car.brand;
        this.series = car.series;
        this.ID = car.ID;
    }

    public Car(String brand, String series, int ID) {
        this.brand = brand;
        this.series = series;
        this.ID = ID;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}

public class ProtoType_pattern {
    public static void main(String[] args) {
        Car originalCar = new Car("Toyota", "Camry", 123);
        Car clonedCar = originalCar.clone();
    }
}
