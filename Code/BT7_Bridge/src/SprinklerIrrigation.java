public class SprinklerIrrigation implements IrrigationSystem {
    private ControlSystem controlSystem;

    public SprinklerIrrigation(ControlSystem controlSystem) {
        this.controlSystem = controlSystem;
    }

    @Override
    public void waterPlants() {
        System.out.println("Using Sprinkler Irrigation to water plants...");
        controlSystem.control();
    }
}