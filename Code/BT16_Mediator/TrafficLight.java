/**
 * TrafficLight class represents a traffic light at an intersection
 * It acts as a Colleague in the Mediator pattern
 */
public class TrafficLight {
    private String direction; // East, West, North, South
    private String color;     // green, red, yellow
    private TrafficMediator mediator;

    /**
     * Constructor for TrafficLight
     * @param direction The direction this traffic light controls
     * @param initialColor The initial color of the traffic light
     */
    public TrafficLight(String direction, String color) {
        this.direction = direction;
        this.color = color;
    }

    /**
     * Sets the mediator for this traffic light
     * @param mediator The mediator that will coordinate this light
     */
    public void setMediator(TrafficMediator mediator) {
        this.mediator = mediator;
    }

    /**
     * Gets the current direction of the traffic light
     * @return The direction (East, West, North, South)
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Gets the current color of the traffic light
     * @return The color (green, red, yellow)
     */
    public String getColor() {
        return color;
    }

    /**
     * Changes the traffic light to green
     */
    public void turnGreen() {
        color = "green";
        System.out.println(direction + " traffic light turned GREEN");
        mediator.notifyColorChange(this);
    }

    /**
     * Changes the traffic light to red
     */
    public void turnRed() {
        color = "red";
        System.out.println(direction + " traffic light turned RED");
    }

    /**
     * Changes the traffic light to yellow
     */
    public void turnYellow() {
        color = "yellow";
        System.out.println(direction + " traffic light turned YELLOW");
    }

    @Override
    public String toString() {
        return direction + " traffic light is " + color.toUpperCase();
    }
}
