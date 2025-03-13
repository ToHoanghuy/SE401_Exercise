public class App {
    public static void main(String[] args) throws Exception {
        PatientRecordManager manager = PatientRecordManager.getInstance();
        Patient patient1 = new Patient("P001", "Nguyen Van A", "Cảm cúm", "0901234567");
        Patient patient2 = new Patient("P002", "Tran Thi B", "Viêm phổi", "0912345678");
        manager.addPatient(patient1);
        manager.addPatient(patient2);
        System.out.println("\nDanh sách hồ sơ bệnh nhân:");
        manager.displayAllRecords();
        manager.updatePatient("P001", "Nguyen Van A", "Sốt xuất huyết", "0901234567");
        System.out.println("\nThông tin bệnh nhân P001 sau khi cập nhật:");
        Patient updatedPatient = manager.getPatient("P001");
        if (updatedPatient != null) {
            System.out.println(updatedPatient);
        }
        PatientRecordManager anotherManager = PatientRecordManager.getInstance();
        System.out.println("\nTruy cập từ nơi khác:");
        anotherManager.displayAllRecords();
    }
}
