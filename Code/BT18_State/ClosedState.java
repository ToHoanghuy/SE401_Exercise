package BT18_State;

/**
 * Lớp ClosedState đại diện cho trạng thái "Đã Hoàn Tất" của vụ án
 */
public class ClosedState implements State {
    
    @Override
    public void handle(Lawsuit lawsuit) {
        System.out.println("Vụ án " + lawsuit.getCaseName() + " đã hoàn tất và được đóng lại");
        System.out.println("Không thể chuyển sang trạng thái khác khi vụ án đã hoàn tất");
        // Trạng thái cuối cùng, không chuyển sang trạng thái nào khác
    }
    
    @Override
    public String getStateName() {
        return "Đã Hoàn Tất";
    }
} 