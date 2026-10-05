package garage;

public class Car {

    String brand;
    String model;
    int mileage;
    double fuelLevel;


    public Car(String brand, String model, int mileage, double fuelLevel) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.fuelLevel = fuelLevel;
    }

    public void drive(int distance) {
        if (distance <= fuelLevel * 10) {
            this.fuelLevel = this.fuelLevel - (distance / 10.0);
            this.mileage += distance;
            System.out.println("Enjoy your journey");
        } else {
            System.out.println("Car cannot drive that fat it only has " + (fuelLevel * 10) + " miles worth of fuel");
        }
    }

    public void refuel(double amount) {
        if (amount < 0) {
            System.out.println("amount needs to be positive");
        } else if ((this.fuelLevel + amount) > 100) {
            System.out.println("you can only put in " + (100 - fuelLevel));
        } else {
            this.fuelLevel += amount;
        }
    }

    public void displayInfo() {
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.mileage);
        System.out.println(this.fuelLevel);
    }


}




