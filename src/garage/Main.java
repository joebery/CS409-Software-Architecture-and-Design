package garage;

public class Main {

    public static void main(String[] args){
        Car car1 = new Car("caterham", "420R", 3000, 80);
        Car car2 = new Car("hyundai", "i10", 120000, 80);

//        car2.displayInfo();
//        car2.drive(200);
//        car2.refuel(10);
//        car2.displayInfo();

        Garage garage1 = new Garage();
        garage1.addCar(car1);
        garage1.addCar(car2);
//        System.out.println(garage1);
        garage1.showAllCars();
        garage1.findCar("i100");
    }
}
