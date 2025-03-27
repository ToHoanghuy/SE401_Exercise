package BT8_Composite;

/**
 * Concrete implementation of MedicalService for consultation service
 */
public class Consultation implements MedicalService {
    private String doctorName;
    private double fee;
    
    /**
     * Constructor for Consultation service
     * @param doctorName the name of the doctor
     * @param fee the consultation fee
     */
    public Consultation(String doctorName, double fee) {
        this.doctorName = doctorName;
        this.fee = fee;
    }
    
    @Override
    public String getDescription() {
        return "Consultation with Dr. " + doctorName;
    }
    
    @Override
    public double getCost() {
        return fee;
    }
}
