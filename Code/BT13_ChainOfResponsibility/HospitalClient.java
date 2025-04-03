public class HospitalClient {
    private Handler chain;

    public HospitalClient() {
        // Thiết lập chuỗi xử lý
        this.chain = new ReceptionHandler();
        Handler diagnosisHandler = new DiagnosisHandler();
        Handler treatmentHandler = new TreatmentHandler();
        Handler consultationHandler = new ConsultationHandler();

        chain.setNextHandler(diagnosisHandler);
        diagnosisHandler.setNextHandler(treatmentHandler);
        treatmentHandler.setNextHandler(consultationHandler);
    }

    public void processPatient(Request request) {
        chain.handleRequest(request);
    }

    public static void main(String[] args) {
        // Tạo một client
        HospitalClient hospital = new HospitalClient();

        // Tạo bệnh nhân và yêu cầu khám
        Patient patient = new Patient("P001", "Nguyễn Văn A", "Sốt, đau đầu");
        Request request = new Request(patient, "Cần khám tổng quát");

        // Xử lý yêu cầu
        hospital.processPatient(request);
    }
}