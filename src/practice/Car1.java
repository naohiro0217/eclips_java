package practice;

public class Car1 {
	private double fuelCost;
	private double fuelAmount;

	public void Car(double fuelCost, double fuelAmount) {
        this.fuelCost = fuelCost;
        this.fuelAmount = fuelAmount;
    }

    public void move(int km) {
        System.out.println(km + " km 走ります");
        this.fuelAmount -= (km / fuelCost);
    }

    public double getFuelAmount() {
        return this.fuelAmount;
    }

}
