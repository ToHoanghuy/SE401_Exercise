public class Patient {
    private final String id;
    private String name;
    private String diagnosis;
    private String contactInfo;

    public Patient(String id, String name, String diagnosis, String contactInfo) {
        this.id = id;
        this.name = name;
        this.diagnosis = diagnosis;
        this.contactInfo = contactInfo;
    }

    // Getters và Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}
