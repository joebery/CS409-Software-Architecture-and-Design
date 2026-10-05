package garage;

import java.util.ArrayList;

public class Garage {
    ArrayList<Car> cars;

    public Garage() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void showAllCars() {
        for (Car car : this.cars) { // same as for (int i = 0; i < this.cars.size();i++){
            car.displayInfo();
        }
    }

    public void findCar(String search) {
        boolean found = false;
        for (Car car : this.cars) {
            if (car.model.equals(search)) {
                System.out.println("found" + car.model);
                found = true;
            }
        }
        if (!found) {
            System.out.println(search+" was not found");
        }

    }
}
