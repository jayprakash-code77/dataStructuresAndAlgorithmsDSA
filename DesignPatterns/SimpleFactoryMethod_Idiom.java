package dataStructuresAndAlgorithmsDSA.DesignPatterns;

/*
 * Factory Method:-
 * 1) It is a Creational design pattern
 * 2) It loosens the coupling of a given code by separating the product's construction code from the code that uses this product.
 */
// Restaurant class 
class Restaurant {
    // Order burger class
    public Burger orderBurger(String request) {
        SimpleBurgerFactory factory = new SimpleBurgerFactory();
        Burger burger = factory.creatBurger(request);
        burger.prepare();
        return burger;
    }
}

class Burger {
    public void prepare() {
        // System.out.println("Burger is prepared.");
    }
}

// class to prepare ChickenBurger
class ChickenBurger extends Burger {
    public void prepare() {
        System.out.println("ChickenBurger is prepared.");
    }
}

// class to prepare VeggieBurger
class VeggieBurger extends Burger {
    public void prepare() {
        System.out.println("VeggieBurger is prepared.");
    }
}

// Simple factor method
class SimpleBurgerFactory {
    public Burger creatBurger(String request) {
        Burger burger = null;
        if ("Chicken".equals(request)) {
            burger = new ChickenBurger();
        } else if ("Veggie".equals(request)) {
            burger = new VeggieBurger();
        }
        return burger;
    }
}

public class SimpleFactoryMethod_Idiom {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.orderBurger("Chicken");
    }
}
