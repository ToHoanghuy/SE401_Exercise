package BT8_Composite;

/**
 * Concrete implementation of MedicalService for X-Ray service
 */
public class XRay implements MedicalService {
    private String bodyPart;
    private double cost;
    
    /**
     * Constructor for XRay service
     * @param bodyPart the body part to be X-Rayed
     * @param cost the cost of the X-Ray
     */
    public XRay(String bodyPart, double cost) {
        this.bodyPart = bodyPart;
        this.cost = cost;
    }
    
    @Override
    public String getDescription() {
        return "X-Ray for " + bodyPart;
    }
    
    @Override
    public double getCost() {
        return cost;
    }
}
