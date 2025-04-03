public class DiagnosisHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("Diagnosis: Thực hiện chẩn đoán cho bệnh nhân " + request.getPatient().getName());
        System.out.println("Triệu chứng: " + request.getPatient().getSymptoms());

        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}