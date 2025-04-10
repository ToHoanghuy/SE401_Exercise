public class TrafficManager {
    private final BusCollection busCollection;
    private final TruckCollection truckCollection;
    private final CarCollection carCollection;

    public TrafficManager() {
        this.busCollection = new BusCollection();
        this.truckCollection = new TruckCollection();
        this.carCollection = new CarCollection();
    }
    
    public BusCollection getBusCollection() {
        return busCollection;
    }
    
    public TruckCollection getTruckCollection() {
        return truckCollection;
    }
    
    public CarCollection getCarCollection() {
        return carCollection;
    }

    public void addVehicle(Vehicle vehicle) {
        switch (vehicle.getType()) {
            case "Bus":
                busCollection.addBus(vehicle);
                break;
            case "Truck":
                truckCollection.addTruck(vehicle);
                break;
            case "Car":
                carCollection.addCar(vehicle);
                break;
            default:
                System.out.println("Unknown vehicle type: " + vehicle.getType());
                break;
        }
    }

    public void displayAllVehicles() {
        System.out.println("\n=== All Buses ===");
        displayVehicles(busCollection.createIterator());

        System.out.println("\n=== All Trucks (capacity >= 10) ===");
        displayVehicles(truckCollection.createIterator());

        System.out.println("\n=== All Cars (sorted by ID) ===");
        displayVehicles(carCollection.createIterator());
    }

    private void displayVehicles(VehicleIterator iterator) {
        while (iterator.hasNext()) {
            Vehicle vehicle = iterator.next();
            System.out.println(vehicle);
        }
    }
}
