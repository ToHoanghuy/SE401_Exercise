import java.util.ArrayList;
import java.util.List;

/**
 * TrafficMediator class is responsible for coordinating traffic lights
 * It acts as the Mediator in the Mediator pattern
 */
public class TrafficMediator {
    private List<TrafficLight> trafficLights;

    /**
     * Constructor for TrafficMediator
     */
    public TrafficMediator() {
        this.trafficLights = new ArrayList<>();
    }

    /**
     * Registers a traffic light with this mediator
     * @param light The traffic light to register
     */
    public void registerLight(TrafficLight light) {
        light.setMediator(this);
        trafficLights.add(light);
        System.out.println("Registered " + light.getDirection() + " traffic light");
    }

    /**
     * Handles notification when a traffic light changes color
     * When one light turns green, all others must turn red for safety
     * @param changedLight The traffic light that changed its color
     */
    public void notifyColorChange(TrafficLight changedLight) {
        if (changedLight.getColor().equals("green")) {
            // If a light turns green, turn all other lights red for safety
            for (TrafficLight light : trafficLights) {
                if (light != changedLight) {
                    light.turnRed();
                }
            }
        }
    }

    /**
     * Changes the state of a specific traffic light
     * @param light The traffic light to change
     */
    public void changeLight(TrafficLight light) {
        String currentColor = light.getColor();
        
        // Implement traffic light cycle: green -> yellow -> red -> green
        switch (currentColor) {
            case "green":
                light.turnYellow();
                break;
            case "yellow":
                light.turnRed();
                break;
            case "red":
                light.turnGreen();
                break;
        }
    }

    /**
     * Displays the current state of all traffic lights
     */
    public void showAllLights() {
        System.out.println("\nCurrent Traffic Light Status:");
        for (TrafficLight light : trafficLights) {
            System.out.println(light);
        }
        System.out.println();
    }
}
