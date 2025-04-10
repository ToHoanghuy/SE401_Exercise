import java.util.ArrayList;
import java.util.List;

public class CarCollection implements VehicleCollection {
    private final List<Vehicle> cars;

    public CarCollection() {
        cars = new ArrayList<>();
    }

    public void addCar(Vehicle car) {
        if ("Car".equals(car.getType())) {
            cars.add(car);
        } else {
            System.out.println("Only cars can be added to CarCollection");
        }
    }

    public List<Vehicle> getCars() {
        return cars;
    }

    @Override
    public VehicleIterator createIterator() {
        return new CarIterator(this);
    }
}
