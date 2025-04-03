public class ConsultationHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("Consultation: Tư vấn sau điều trị cho bệnh nhân " + request.getPatient().getName());
        System.out.println("Hướng dẫn chăm sóc sức khỏe và theo dõi");

        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}