public class BusIterator implements VehicleIterator {
    private final BusCollection busCollection;
    private int position;

    public BusIterator(BusCollection busCollection) {
        this.busCollection = busCollection;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < busCollection.getBuses().size();
    }

    @Override
    public Vehicle next() {
        if (this.hasNext()) {
            return busCollection.getBuses().get(position++);
        }
        return null;
    }
}
