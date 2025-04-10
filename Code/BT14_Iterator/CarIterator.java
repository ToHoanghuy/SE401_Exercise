import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarIterator implements VehicleIterator {
    private List<Vehicle> sortedCars;
    private int position;

    public CarIterator(CarCollection carCollection) {
        // Sort cars by registration date (using vehicleId as a proxy for this example)
        // In a real application, you might have a registration date field
        this.sortedCars = carCollection.getCars().stream()
                .sorted(Comparator.comparing(Vehicle::getVehicleId))
                .collect(Collectors.toList());
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < sortedCars.size();
    }

    @Override
    public Vehicle next() {
        if (this.hasNext()) {
            return sortedCars.get(position++);
        }
        return null;
    }
}
