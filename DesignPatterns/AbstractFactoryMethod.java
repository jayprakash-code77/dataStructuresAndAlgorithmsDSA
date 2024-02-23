package dataStructuresAndAlgorithmsDSA.DesignPatterns;

/*
 * Uses of "Abstract Factory Pattern".
 * 1) Use it when your code needs to work with various families of related products.
 * 2) Many design start by using Factory Method Pattern and later evolve toward an Abstract Factory Design.
 * 3) Abstract Factory Pattern, Follows the "Open/Closed" and "Single Responsibility" principles.
 * 4) Centralizes the product creation code in one place in the program.
 */

abstract class Company {
    // Business Logic of "Company class "
    // GPU logic
    public Gpu assembleGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    // // // Monitor logic
    public Monitor assembleMonitor() {
        Monitor monitor = createMonitor();
        monitor.assemble();
        return monitor;
    }

    // Abstract methods of "Company class "
    // abstract methods
    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}

// AsusManufacturer
class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}

// MsiManufacturer
class MsiManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}

// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< GPU (Product 1)
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

interface Gpu {
    void assemble();
}

class MsiGpu implements Gpu {
    // @Override
    public void assemble() {
        System.out.println("MsiGpu is prepared.");
    }
}

class AsusGpu implements Gpu {
    // @Override
    public void assemble() {
        System.out.println("AsusGpu is prepared.");
    }
}

// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< MONITORS (Product 2)
// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
interface Monitor {
    void assemble();
}

class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("MsiMonitor is prepared.");
    }
}

class AsusMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("AsusMonitor is prepared.");
    }
}

public class AbstractFactoryMethod {
    public static void main(String[] args) {
        // this code will only work when we will have business logic in our "COMPANY
        // class".
        Company asus = new AsusManufacturer();
        Gpu g = asus.assembleGpu();
        Monitor m = asus.assembleMonitor();

        // This code will work even if we don't have business logic in "COMPANY class".
        Company msi = new MsiManufacturer();
        Gpu msigpu = msi.createGpu();
        msigpu.assemble();
        Monitor msimonitor = msi.createMonitor();
        msimonitor.assemble();

    }
}
