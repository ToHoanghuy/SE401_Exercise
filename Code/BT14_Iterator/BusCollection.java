import java.util.ArrayList;
import java.util.List;

public class BusCollection implements VehicleCollection {
    private final List<Vehicle> buses;

    public BusCollection() {
        buses = new ArrayList<>();
    }

    public void addBus(Vehicle bus) {
        if ("Bus".equals(bus.getType())) {
            buses.add(bus);
        } else {
            System.out.println("Only buses can be added to BusCollection");
        }
    }

    public List<Vehicle> getBuses() {
        return buses;
    }

    @Override
    public VehicleIterator createIterator() {
        return new BusIterator(this);
    }
}
