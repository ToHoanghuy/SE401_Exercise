public class DripIrrigation implements IrrigationSystem {
    private ControlSystem controlSystem;

    public DripIrrigation(ControlSystem controlSystem) {
        this.controlSystem = controlSystem;
    }

    @Override
    public void waterPlants() {
        System.out.println("Using Drip Irrigation to water plants...");
        controlSystem.control();
    }
}