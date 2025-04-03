public class TreatmentHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("Treatment: Thực hiện điều trị cho bệnh nhân " + request.getPatient().getName());
        System.out.println("Kê đơn thuốc và hướng dẫn điều trị");

        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}