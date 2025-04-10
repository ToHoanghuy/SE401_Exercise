public class TruckIterator implements VehicleIterator {
    private final TruckCollection truckCollection;
    private int position;
    private static final int MIN_CAPACITY = 10; // Minimum capacity threshold (10 tons)

    public TruckIterator(TruckCollection truckCollection) {
        this.truckCollection = truckCollection;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        // Skip trucks with capacity less than MIN_CAPACITY
        while (position < truckCollection.getTrucks().size()) {
            Vehicle truck = truckCollection.getTrucks().get(position);
            if (truck.getCapacity() >= MIN_CAPACITY) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Vehicle next() {
        if (this.hasNext()) {
            return truckCollection.getTrucks().get(position++);
        }
        return null;
    }
}
