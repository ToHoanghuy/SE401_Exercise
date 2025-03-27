package BT8_Composite;

/**
 * Interface representing a medical service in a hospital
 */
public interface MedicalService {
    /**
     * Get the description of the medical service
     * @return the description
     */
    String getDescription();
    
    /**
     * Get the cost of the medical service
     * @return the cost
     */
    double getCost();
}
