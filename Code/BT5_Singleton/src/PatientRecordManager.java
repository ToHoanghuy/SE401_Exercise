import java.util.HashMap;
import java.util.Map;

public class PatientRecordManager {
    // Thể hiện duy nhất của lớp (Singleton)
    private static PatientRecordManager instance;

    // Map để lưu trữ hồ sơ bệnh nhân, với key là ID bệnh nhân
    private final Map<String, Patient> patientRecords;

    // Constructor private để ngăn việc tạo thể hiện từ bên ngoài
    private PatientRecordManager() {
        patientRecords = new HashMap<>();
    }

    // Phương thức tĩnh để lấy thể hiện duy nhất của PatientRecordManager
    public static PatientRecordManager getInstance() {
        if (instance == null) {
            synchronized (PatientRecordManager.class) {
                if (instance == null) {
                    instance = new PatientRecordManager();
                }
            }
        }
        return instance;
    }

    // Thêm mới hồ sơ bệnh nhân
    public void addPatient(Patient patient) {
        if (patientRecords.containsKey(patient.getId())) {
            System.out.println("Bệnh nhân với ID " + patient.getId() + " đã tồn tại!");
        } else {
            patientRecords.put(patient.getId(), patient);
            System.out.println("Đã thêm bệnh nhân: " + patient.getName());
        }
    }

    // Cập nhật thông tin bệnh nhân
    public void updatePatient(String patientId, String name, String diagnosis, String contactInfo) {
        Patient patient = patientRecords.get(patientId);
        if (patient != null) {
            patient.setName(name);
            patient.setDiagnosis(diagnosis);
            patient.setContactInfo(contactInfo);
            System.out.println("Đã cập nhật thông tin bệnh nhân với ID: " + patientId);
        } else {
            System.out.println("Không tìm thấy bệnh nhân với ID: " + patientId);
        }
    }

    // Truy vấn thông tin bệnh nhân
    public Patient getPatient(String patientId) {
        Patient patient = patientRecords.get(patientId);
        if (patient == null) {
            System.out.println("Không tìm thấy bệnh nhân với ID: " + patientId);
        }
        return patient;
    }

    // Hiển thị tất cả hồ sơ bệnh nhân (dùng để kiểm tra)
    public void displayAllRecords() {
        if (patientRecords.isEmpty()) {
            System.out.println("Chưa có hồ sơ bệnh nhân nào.");
        } else {
            for (Patient patient : patientRecords.values()) {
                System.out.println(patient);
            }
        }
    }
}