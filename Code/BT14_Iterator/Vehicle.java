public class Vehicle {
    private String vehicleId;
    private String type;
    private String licensePlate;
    private int capacity;
    private String manufacturer;

    public Vehicle(String vehicleId, String type, String licensePlate, int capacity, String manufacturer) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.licensePlate = licensePlate;
        this.capacity = capacity;
        this.manufacturer = manufacturer;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getType() {
        return type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", type='" + type + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", capacity=" + capacity +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
