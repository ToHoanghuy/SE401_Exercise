package BT8_Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite implementation of MedicalService that can contain multiple services
 */
public class CompositeMedicalService implements MedicalService {
    private String packageName;
    private List<MedicalService> services;
    
    /**
     * Constructor for CompositeMedicalService
     * @param packageName the name of the service package
     */
    public CompositeMedicalService(String packageName) {
        this.packageName = packageName;
        this.services = new ArrayList<>();
    }
    
    /**
     * Add a medical service to this composite
     * @param service the service to add
     */
    public void addService(MedicalService service) {
        services.add(service);
    }
    
    /**
     * Remove a medical service from this composite
     * @param service the service to remove
     * @return true if the service was removed, false otherwise
     */
    public boolean removeService(MedicalService service) {
        return services.remove(service);
    }
    
    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder(packageName + " Package includes:\n");
        for (MedicalService service : services) {
            description.append("- ").append(service.getDescription()).append("\n");
        }
        return description.toString();
    }
    
    @Override
    public double getCost() {
        double totalCost = 0;
        for (MedicalService service : services) {
            totalCost += service.getCost();
        }
        return totalCost;
    }
    
    /**
     * Get the list of services in this composite
     * @return the list of services
     */
    public List<MedicalService> getServices() {
        return new ArrayList<>(services);
    }
}
