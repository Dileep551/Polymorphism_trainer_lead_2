public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void StartEngin(){

        System.out.println("Car -> startEngin");


    }
    public void drive(){

        System.out.println("car -> driving, type is "+ getClass().getSimpleName());
        runEngin();

    }
    protected void runEngin(){

        System.out.println("Car - > runEngin");

    }

}

class GasPoweredCar extends Car {

    private double avgKmPerLiter;

    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void StartEngin() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngin() {
        System.out.printf("Gas -> usage exceeds the average %.2f %n", avgKmPerLiter);
    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;

    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void StartEngin() {
        super.StartEngin();
        System.out.println("Engine Started with Button");
    }

    @Override
    protected void runEngin() {
        super.runEngin();
    }
}

class HybridCar extends Car {

    private double avgKmPerLiter;

    private int batterySize;

    private int cylinders;

    public HybridCar(String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void StartEngin() {
        super.StartEngin();
        System.out.println("Engine Started with remote");
    }

    @Override
    protected void runEngin() {
        super.runEngin();
    }
}
