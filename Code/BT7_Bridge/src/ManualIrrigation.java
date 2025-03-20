public class ManualIrrigation implements IrrigationSystem {
    private ControlSystem controlSystem;

    public ManualIrrigation(ControlSystem controlSystem) {
        this.controlSystem = controlSystem;
    }

    @Override
    public void waterPlants() {
        System.out.println("Using Manual Irrigation to water plants...");
        controlSystem.control();
    }
}
