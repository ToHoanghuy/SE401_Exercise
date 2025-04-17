package BT18_State;

/**
 * Lớp AwaitingJudgmentState đại diện cho trạng thái "Chờ Phán Quyết" của vụ án
 */
public class AwaitingJudgmentState implements State {
    
    @Override
    public void handle(Lawsuit lawsuit) {
        System.out.println("Vụ án " + lawsuit.getCaseName() + " đang chờ tòa án đưa ra phán quyết");
        
        try {
            // Thêm độ trễ để mô phỏng thời gian chờ phán quyết
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Sau khi có phán quyết, chuyển sang trạng thái Đã Hoàn Tất
        lawsuit.setState(new ClosedState());
    }
    
    @Override
    public String getStateName() {
        return "Chờ Phán Quyết";
    }
} 