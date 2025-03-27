package BT8_Composite;

/**
 * Demo class to test the Composite Pattern for medical services
 */
public class HospitalDemo {
    public static void main(String[] args) {
        // Create individual services
        MedicalService consultation = new Consultation("Nguyen", 500000);
        MedicalService xray = new XRay("Chest", 1200000);
        MedicalService surgery = new Surgery("Appendectomy", 15000000);
        
        // Print details of individual services
        System.out.println("Individual Services:");
        System.out.println("--------------------");
        printServiceDetails(consultation);
        printServiceDetails(xray);
        printServiceDetails(surgery);
        
        // Create a basic health check package
        CompositeMedicalService basicCheckup = new CompositeMedicalService("Basic Health Check");
        basicCheckup.addService(consultation);
        basicCheckup.addService(xray);
        
        // Create a comprehensive surgery package
        CompositeMedicalService surgeryPackage = new CompositeMedicalService("Surgery Package");
        surgeryPackage.addService(consultation);
        surgeryPackage.addService(xray);
        surgeryPackage.addService(surgery);
        
        // Create a nested package (a package containing another package)
        CompositeMedicalService familyPackage = new CompositeMedicalService("Family Health Package");
        familyPackage.addService(basicCheckup);
        familyPackage.addService(new Consultation("Tran", 600000));
        
        // Print details of composite services
        System.out.println("\nComposite Services:");
        System.out.println("-------------------");
        printServiceDetails(basicCheckup);
        
        System.out.println("\n");
        printServiceDetails(surgeryPackage);
        
        System.out.println("\n");
        printServiceDetails(familyPackage);
        
        // Demonstrate removing a service
        System.out.println("\nAfter removing X-Ray from Surgery Package:");
        surgeryPackage.removeService(xray);
        printServiceDetails(surgeryPackage);
    }
    
    private static void printServiceDetails(MedicalService service) {
        System.out.println(service.getDescription());
        System.out.println("Cost: " + formatCurrency(service.getCost()) + " VND");
    }
    
    private static String formatCurrency(double amount) {
        return String.format("%,.0f", amount);
    }
}
