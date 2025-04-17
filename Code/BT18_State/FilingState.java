package BT18_State;

/**
 * Lớp FilingState đại diện cho trạng thái "Khởi Kiện" của vụ án
 */
public class FilingState implements State {
    
    @Override
    public void handle(Lawsuit lawsuit) {
        System.out.println("Đang xử lý hồ sơ khởi kiện cho vụ án: " + lawsuit.getCaseName());
        
        try {
            // Thêm độ trễ để mô phỏng thời gian xử lý
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Sau khi xử lý xong khởi kiện, chuyển sang trạng thái Đang Xét Xử
        lawsuit.setState(new TrialState());
    }
    
    @Override
    public String getStateName() {
        return "Khởi Kiện";
    }
} 