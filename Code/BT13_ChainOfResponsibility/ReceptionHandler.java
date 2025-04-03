public class ReceptionHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(Request request) {
        System.out.println("Reception: Tiếp nhận bệnh nhân " + request.getPatient().getName());
        System.out.println("Kiểm tra thông tin cá nhân và triệu chứng ban đầu");

        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}