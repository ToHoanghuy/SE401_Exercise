public class App {
    public static void main(String[] args) throws Exception {
        // Tạo các đối tượng điều khiển
        ControlSystem manualControl = new ManualControl();
        ControlSystem automaticControl = new AutomaticControl();

        // Thử nghiệm các cấu hình khác nhau
        System.out.println("=== Configuration 1: Drip Irrigation with Manual Control ===");
        IrrigationSystem dripManual = new DripIrrigation(manualControl);
        dripManual.waterPlants();

        System.out.println("\n=== Configuration 2: Drip Irrigation with Automatic Control ===");
        IrrigationSystem dripAuto = new DripIrrigation(automaticControl);
        dripAuto.waterPlants();

        System.out.println("\n=== Configuration 3: Sprinkler Irrigation with Manual Control ===");
        IrrigationSystem sprinklerManual = new SprinklerIrrigation(manualControl);
        sprinklerManual.waterPlants();

        System.out.println("\n=== Configuration 4: Sprinkler Irrigation with Automatic Control ===");
        IrrigationSystem sprinklerAuto = new SprinklerIrrigation(automaticControl);
        sprinklerAuto.waterPlants();

        System.out.println("\n=== Configuration 5: Manual Irrigation with Manual Control ===");
        IrrigationSystem manualIrrigationManual = new ManualIrrigation(manualControl);
        manualIrrigationManual.waterPlants();

        System.out.println("\n=== Configuration 6: Manual Irrigation with Automatic Control ===");
        IrrigationSystem manualIrrigationAuto = new ManualIrrigation(automaticControl);
        manualIrrigationAuto.waterPlants();
    }
}
