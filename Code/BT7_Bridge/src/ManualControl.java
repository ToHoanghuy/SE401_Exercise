public class ManualControl implements ControlSystem {
    @Override
    public void control() {
        System.out.println("System is manually controlled by the farmer.");
    }
}