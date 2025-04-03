public class Request {
    private Patient patient;
    private String healthStatus;

    public Request(Patient patient, String healthStatus) {
        this.patient = patient;
        this.healthStatus = healthStatus;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getHealthStatus() {
        return healthStatus;
    }
}