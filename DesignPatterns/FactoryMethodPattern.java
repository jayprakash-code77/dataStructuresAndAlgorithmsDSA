package dataStructuresAndAlgorithmsDSA.DesignPatterns;

/*
 * Factory Method:-
 * 1) It is a Creational design pattern
 * 2) It loosens the coupling of a given code by separating the product's construction code from the code that uses this product.
 */
// Restaurant class 
abstract class Restaurant {
    // Order burger function
    public Burger orderBurger() {
        Burger burger = creatBurger();
        burger.prepare();
        return burger;
    }

    // method to create burger
    public abstract Burger creatBurger();
}

// 1) Sub-classes (ChickenBurgerRestarant) of Resturant class
class ChickenBurgerRestarant extends Restaurant {
    @Override
    public Burger creatBurger() {
        return new ChickenBurger();
    }
}

// 2) Sub-classes (VeggieBurgerRestarant) of Restarant class
class VeggieBurgerRestarant extends Restaurant {
    @Override
    public Burger creatBurger() {
        return new VeggieBurger();
    }
}

// 3) Sub-classes (PaneerBurgerRestarant) of Restarant class
class PaneerBurgerRestarant extends Restaurant {
    @Override
    public Burger creatBurger() {
        return new PaneerBurger();
    }
}

interface Burger {
    void prepare();
    // System.out.println("Burger is prepared.");

}

// class to prepare ChickenBurger
class ChickenBurger implements Burger {
    // @Override
    public void prepare() {
        System.out.println("ChickenBurger is prepared.");
    }
}

// class to prepare VeggieBurger
class VeggieBurger implements Burger {
    // @Override
    public void prepare() {
        System.out.println("VeggieBurger is prepared.");
    }
}

// class to prepare PaneerBurger
class PaneerBurger implements Burger {
    // @Override
    public void prepare() {
        System.out.println("PaneerBurger is prepared.");
    }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        // Restaurant chickenResto = new ChickenBurgerRestarant();
        // Burger chickenBurger = chickenResto.orderBurger();

        Restaurant paneerResto = new PaneerBurgerRestarant();
        Burger paneerBurger = paneerResto.orderBurger();

        // Restaurant veggieResto = new VeggieBurgerRestarant();
        // Burger veggieBurger = veggieResto.orderBurger();
    }
}
