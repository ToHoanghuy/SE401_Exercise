/**
 * TrafficControlSystem demonstrates the Mediator pattern for traffic control
 * This class acts as the client in the Mediator pattern
 */
public class TrafficControlSystem {
    public static void main(String[] args) {
        // Create the mediator
        TrafficMediator mediator = new TrafficMediator();
        
        // Create traffic lights for all four directions
        TrafficLight eastLight = new TrafficLight("East", "red");
        TrafficLight westLight = new TrafficLight("West", "red");
        TrafficLight northLight = new TrafficLight("North", "red");
        TrafficLight southLight = new TrafficLight("South", "red");
        
        // Register all lights with the mediator
        mediator.registerLight(eastLight);
        mediator.registerLight(westLight);
        mediator.registerLight(northLight);
        mediator.registerLight(southLight);
        
        // Show initial state of all traffic lights
        mediator.showAllLights();
        
        // Simulate traffic flow by changing lights
        System.out.println("Changing East traffic light...");
        mediator.changeLight(eastLight);  // Should turn green
        mediator.showAllLights();
        
        System.out.println("Changing East traffic light again...");
        mediator.changeLight(eastLight);  // Should turn yellow
        mediator.showAllLights();
        
        System.out.println("Changing East traffic light again...");
        mediator.changeLight(eastLight);  // Should turn red
        mediator.showAllLights();
        
        System.out.println("Changing North traffic light...");
        mediator.changeLight(northLight); // Should turn green and make others red
        mediator.showAllLights();
    }
}
