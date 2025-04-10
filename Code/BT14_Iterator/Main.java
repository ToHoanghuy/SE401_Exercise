public class Main {
    public static void main(String[] args) {
        // Create TrafficManager
        TrafficManager trafficManager = new TrafficManager();

        // Add buses
        trafficManager.addVehicle(new Vehicle("B001", "Bus", "29B-12345", 50, "Hyundai"));
        trafficManager.addVehicle(new Vehicle("B002", "Bus", "29B-67890", 45, "Mercedes"));
        trafficManager.addVehicle(new Vehicle("B003", "Bus", "29B-54321", 60, "Volvo"));

        // Add trucks
        trafficManager.addVehicle(new Vehicle("T001", "Truck", "34C-12345", 15, "Isuzu"));
        trafficManager.addVehicle(new Vehicle("T002", "Truck", "34C-67890", 8, "Hino")); // Will be filtered out (capacity < 10)
        trafficManager.addVehicle(new Vehicle("T003", "Truck", "34C-54321", 20, "Mitsubishi"));

        // Add cars
        trafficManager.addVehicle(new Vehicle("C003", "Car", "30A-54321", 5, "Toyota"));
        trafficManager.addVehicle(new Vehicle("C001", "Car", "30A-12345", 5, "Honda"));
        trafficManager.addVehicle(new Vehicle("C002", "Car", "30A-67890", 4, "Ford"));

        // Display all vehicles using iterators
        trafficManager.displayAllVehicles();

        // Demonstrate individual iterators
        System.out.println("\n=== Demonstrating individual iterators ===");
        
        // Bus Iterator
        System.out.println("\nUsing BusIterator:");
        VehicleIterator busIterator = trafficManager.getBusCollection().createIterator();
        while (busIterator.hasNext()) {
            Vehicle bus = busIterator.next();
            System.out.println("Bus: " + bus.getLicensePlate() + " - Capacity: " + bus.getCapacity());
        }

        // Truck Iterator (only trucks with capacity >= 10)
        System.out.println("\nUsing TruckIterator (only trucks with capacity >= 10):");
        VehicleIterator truckIterator = trafficManager.getTruckCollection().createIterator();
        while (truckIterator.hasNext()) {
            Vehicle truck = truckIterator.next();
            System.out.println("Truck: " + truck.getLicensePlate() + " - Capacity: " + truck.getCapacity());
        }

        // Car Iterator (sorted by ID)
        System.out.println("\nUsing CarIterator (sorted by ID):");
        VehicleIterator carIterator = trafficManager.getCarCollection().createIterator();
        while (carIterator.hasNext()) {
            Vehicle car = carIterator.next();
            System.out.println("Car: " + car.getLicensePlate() + " - Manufacturer: " + car.getManufacturer());
        }
    }
}
