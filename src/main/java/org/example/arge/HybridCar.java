package org.example.arge;

public class HybridCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String name, String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String drive() {
        return super.drive();
    }

    @Override
    protected String runEngine() {
        return super.runEngine();
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }



}
