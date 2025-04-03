public class Patient {
    private String patientId;
    private String name;
    private String symptoms;

    public Patient(String patientId, String name, String symptoms) {
        this.patientId = patientId;
        this.name = name;
        this.symptoms = symptoms;
    }

    // Getters and setters
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getSymptoms() {
        return symptoms;
    }
}