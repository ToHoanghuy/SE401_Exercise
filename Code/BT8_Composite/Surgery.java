package BT8_Composite;

/**
 * Concrete implementation of MedicalService for Surgery service
 */
public class Surgery implements MedicalService {
    private String type;
    private double cost;
    
    /**
     * Constructor for Surgery service
     * @param type the type of surgery
     * @param cost the cost of the surgery
     */
    public Surgery(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }
    
    @Override
    public String getDescription() {
        return type + " Surgery";
    }
    
    @Override
    public double getCost() {
        return cost;
    }
}
