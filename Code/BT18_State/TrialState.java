package BT18_State;

/**
 * Lớp TrialState đại diện cho trạng thái "Đang Xét Xử" của vụ án
 */
public class TrialState implements State {
    
    @Override
    public void handle(Lawsuit lawsuit) {
        System.out.println("Vụ án " + lawsuit.getCaseName() + " đang trong quá trình xét xử");
        
        try {
            // Thêm độ trễ để mô phỏng thời gian xét xử
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Sau khi xét xử xong, chuyển sang trạng thái Chờ Phán Quyết
        lawsuit.setState(new AwaitingJudgmentState());
    }
    
    @Override
    public String getStateName() {
        return "Đang Xét Xử";
    }
} 