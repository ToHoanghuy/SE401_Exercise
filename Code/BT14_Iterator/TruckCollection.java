import java.util.ArrayList;
import java.util.List;

public class TruckCollection implements VehicleCollection {
    private final List<Vehicle> trucks;

    public TruckCollection() {
        trucks = new ArrayList<>();
    }

    public void addTruck(Vehicle truck) {
        if ("Truck".equals(truck.getType())) {
            trucks.add(truck);
        } else {
            System.out.println("Only trucks can be added to TruckCollection");
        }
    }

    public List<Vehicle> getTrucks() {
        return trucks;
    }

    @Override
    public VehicleIterator createIterator() {
        return new TruckIterator(this);
    }
}
