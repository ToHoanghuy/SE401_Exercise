# Traffic Management System - Iterator Pattern Implementation

This project demonstrates the implementation of the Iterator design pattern for a traffic management system. The system manages different types of vehicles (buses, trucks, and cars) using specialized collections and iterators.

## Project Structure

- `Vehicle.java` - Base class for all vehicles with properties like ID, type, license plate, capacity, and manufacturer
- `VehicleIterator.java` - Interface defining the Iterator pattern with `hasNext()` and `next()` methods
- `VehicleCollection.java` - Interface for collections with the `createIterator()` method
- `BusCollection.java` & `BusIterator.java` - Collection and iterator for buses
- `TruckCollection.java` & `TruckIterator.java` - Collection and iterator for trucks (filters trucks with capacity < 10)
- `CarCollection.java` & `CarIterator.java` - Collection and iterator for cars (sorts cars by ID)
- `TrafficManager.java` - Client class that manages all vehicle collections
- `Main.java` - Demo application showing the pattern in action

## Special Features

1. **BusIterator**: Iterates through all buses in the collection
2. **TruckIterator**: Only iterates through trucks with capacity >= 10 tons
3. **CarIterator**: Iterates through cars sorted by their ID

## How to Compile and Run

```bash
# Compile all Java files
javac *.java

# Run the main class
java Main
```

## Expected Output

The program will display:
1. All buses in the system
2. All trucks with capacity >= 10 tons
3. All cars sorted by ID
4. Individual demonstrations of each iterator type

## Iterator Pattern Implementation

This project follows the Iterator pattern with:
- **Concrete Collections**: BusCollection, TruckCollection, CarCollection
- **Concrete Iterators**: BusIterator, TruckIterator, CarIterator
- **Client**: TrafficManager that uses the iterators without knowing the underlying collection structure

## Class Diagram

```mermaid
classDiagram
    %% Interfaces
    class VehicleCollection {
        <<interface>>
        +createIterator() VehicleIterator
    }
    
    class VehicleIterator {
        <<interface>>
        +hasNext() boolean
        +next() Vehicle
    }
    
    %% Base class
    class Vehicle {
        -String vehicleId
        -String type
        -String licensePlate
        -int capacity
        -String manufacturer
        +getVehicleId() String
        +getType() String
        +getLicensePlate() String
        +getCapacity() int
        +getManufacturer() String
        +toString() String
    }
    
    %% Collections
    class BusCollection {
        -List~Vehicle~ buses
        +addBus(Vehicle) void
        +getBuses() List~Vehicle~
        +createIterator() VehicleIterator
    }
    
    class TruckCollection {
        -List~Vehicle~ trucks
        +addTruck(Vehicle) void
        +getTrucks() List~Vehicle~
        +createIterator() VehicleIterator
    }
    
    class CarCollection {
        -List~Vehicle~ cars
        +addCar(Vehicle) void
        +getCars() List~Vehicle~
        +createIterator() VehicleIterator
    }
    
    %% Iterators
    class BusIterator {
        -BusCollection busCollection
        -int position
        +hasNext() boolean
        +next() Vehicle
    }
    
    class TruckIterator {
        -TruckCollection truckCollection
        -int position
        -MIN_CAPACITY int
        +hasNext() boolean
        +next() Vehicle
    }
    
    class CarIterator {
        -List~Vehicle~ sortedCars
        -int position
        +hasNext() boolean
        +next() Vehicle
    }
    
    %% Client
    class TrafficManager {
        -BusCollection busCollection
        -TruckCollection truckCollection
        -CarCollection carCollection
        +addVehicle(Vehicle) void
        +displayAllVehicles() void
        -displayVehicles(VehicleIterator) void
    }
    
    %% Relationships
    VehicleCollection <|.. BusCollection
    VehicleCollection <|.. TruckCollection
    VehicleCollection <|.. CarCollection
    
    VehicleIterator <|.. BusIterator
    VehicleIterator <|.. TruckIterator
    VehicleIterator <|.. CarIterator
    
    BusCollection ..> BusIterator : creates >
    TruckCollection ..> TruckIterator : creates >
    CarCollection ..> CarIterator : creates >
    
    BusIterator o-- BusCollection
    TruckIterator o-- TruckCollection
    CarIterator o-- CarCollection
    
    TrafficManager o-- BusCollection
    TrafficManager o-- TruckCollection
    TrafficManager o-- CarCollection
    
    BusCollection o-- "*" Vehicle : contains
    TruckCollection o-- "*" Vehicle : contains
    CarCollection o-- "*" Vehicle : contains
```
