package dataStructuresAndAlgorithmsDSA.DesignPatterns;

/*
 * What is builder?
 * ans:- Extract the object construction or creation code out of it's own class and move it to separate objects called.
 * NOTE := 1) Builder Pattern Seperste the construction of an object from its representation. 2) Create "Builder class containing the same fields" of the object you need to create. 3) Add several setter-methods for these fields and a "build" method responsible for creating the object. 4) Think about creating a "Director" if the same creation code is used to create serveral objects. 5) Client must create both "The builder and the Director"
 */

class CarBuilder {
    private String brand;
    private String color;
    private int id;

    public CarBuilder Id(int id) {
        this.id = id;
        return this;
    }

    public CarBuilder Color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder Brand(String brand) {
        this.brand = brand;
        return this;
    }

    public Car build() {
        return new Car(id, brand, color);
    }
}

class Car {
    private final int id;
    private final String brand;
    private final String color;

    Car(int id, String brand, String color) {
        this.id = id;
        this.color = color;
        this.brand = brand;
    }

    // <<<<<<<<<<<<<<<<<<< getters >>>>>>>>>>>>>>>>>>>>
    // getId function
    public int getId() {
        return this.id;
    }

    // getBrand function
    public String getBrand() {
        return this.brand;
    }

    // getColor function
    public String getColor() {
        return this.color;
    }
}

class Director {
    // buildBugatti
    public void buildBugatti(CarBuilder builder) {
        builder.Brand("Bugatti")
                .Color("Blue")
                .Id(7);
    }

    public void buildLambo(CarBuilder builder) {
        builder.Brand("Lamborghini")
                .Color("Yellow")
                .Id(9);
    }
}

public class BuilderPattern {
    public static void main(String[] args) {

        /*
         * // this can be done when we don't have "Director class" <NOTE>
         * >>>>>>>>>>>>>>>>
         * CarBuilder carBuilder = new CarBuilder();
         * Car car = carBuilder.Id(1) // no semicolon > This is an example of
         * "Method Chaining" here we don't have to use semocolon.
         * .Brand("Buggati")// no semicolon
         * .Color("Red")// no semicolon
         * .build();
         * 
         * CarBuilder b = new CarBuilder();
         * Car c = b.Id(1)
         * .Brand("Toyota")
         * .Color("Red")
         * .build();
         */

        /*
         * // this will work only if we have director class
         * Director director = new Director();
         * CarBuilder builder = new CarBuilder();
         * director.buildLambo(builder);
         * Car car = builder.build();
         * System.out.println(car.getBrand());
         * // car.id = 12; // you cannot do this because "id" is a final variable.
         * System.out.println(car.getId()); // this will print 9.
         * // <<<<<<<<<<<<<<<<<we can change the "id" with this method>>>>>>>>>>>>
         * CarBuilder carBuilder = new CarBuilder();
         * Car cars = carBuilder.Id(1)
         * .build();
         * System.out.println(cars.getId()); // this will print 1. Here the valure of
         * "id" has being changed.
         */

        // CarSchemaBuilder class for all type of car ******************* We will do it
        // later

    }
}

// >>>>>>>>>>>>>>>>>>>>>> ChatGPT Code <<<<<<<<<<<<<<<<<<<<<<<<
// class CarBuilder {
// private String brand;
// private String color;
// private int id;

// public CarBuilder Id(int id) {
// this.id = id;
// return this; // Added return statement
// }

// public CarBuilder Color(String color) {
// this.color = color;
// return this; // Added return statement
// }

// public CarBuilder Brand(String brand) {
// this.brand = brand;
// return this; // A dded return statement
// }

// public Car build() {
// return new Car(id, brand, color);
// }
// }

// class Car {
// private final int id;
// private final String brand;
// private final String color;

// Car(int id, String brand, String color) {
// this.id = id;
// this.color = color;
// this.brand = brand;
// }

// public int getId() {
// return id;
// }

// public String getBrand() {
// return brand;
// }

// public String getColor() {
// return color;
// }
// }

// public class BuilderPattern {
// public static void main(String[] args) {
// // Create an instance of CarBuilder
// CarBuilder carBuilder = new CarBuilder();

// // Set the properties of the car using method chaining
// Car car = carBuilder.Id(1)
// .Brand("Toyota")
// .Color("Red")
// .build();

// // Now you have a constructed Car object
// // You can use it as needed
// System.out.println("Car ID: " + car.getId());
// System.out.println("Car Brand: " + car.getBrand());
// System.out.println("Car Color: " + car.getColor());
// }
// }
