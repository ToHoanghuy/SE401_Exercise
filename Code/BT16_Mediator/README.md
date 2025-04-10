# Traffic Control System using Mediator Pattern

This project implements a traffic control system using the Mediator design pattern. The system manages traffic lights at a four-way intersection (East, West, North, South) to prevent collisions and ensure smooth traffic flow.

## Components

### TrafficLight (Colleague)
- Represents a traffic light at a specific direction
- Has properties:
  - `direction`: East, West, North, South
  - `color`: green, red, yellow
- Methods to change states: `turnGreen()`, `turnRed()`, `turnYellow()`

### TrafficMediator (Mediator)
- Coordinates all traffic lights
- Ensures when one light turns green, all others turn red for safety
- Methods:
  - `registerLight()`: Add a light to the system
  - `notifyColorChange()`: Handle state changes
  - `changeLight()`: Change a light's state

## Design Pattern Implementation

The Mediator pattern is implemented as follows:

1. **TrafficLight** acts as the Colleague class that communicates with other colleagues through the mediator
2. **TrafficMediator** acts as the Mediator that coordinates all traffic lights
3. The communication between traffic lights is decoupled - lights don't know about each other directly

## How to Run

Compile and run the `TrafficControlSystem` class:

```
javac *.java
java TrafficControlSystem
```

## Class Diagram

```
+----------------+       +----------------+
| TrafficLight   |<----->| TrafficMediator|
+----------------+       +----------------+
| -direction     |       | -trafficLights |
| -color         |       +----------------+
| -mediator      |       | +registerLight()|
+----------------+       | +notifyColorChange()|
| +turnGreen()   |       | +changeLight() |
| +turnRed()     |       +----------------+
| +turnYellow()  |              ^
+----------------+              |
                               uses
                                |
                        +----------------+
                        |TrafficControlSystem|
                        +----------------+
```

This implementation demonstrates how the Mediator pattern can be used to manage complex interactions between objects while keeping them loosely coupled.
