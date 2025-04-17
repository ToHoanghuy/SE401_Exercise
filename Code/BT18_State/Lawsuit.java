package BT18_State;

/**
 * Lớp Lawsuit đóng vai trò là Context trong mẫu thiết kế State
 * Quản lý trạng thái hiện tại của vụ án và cho phép chuyển đổi giữa các trạng thái
 */
public class Lawsuit {
    private State currentState;
    private String caseName;
    
    /**
     * Khởi tạo một vụ án mới với tên và trạng thái ban đầu
     * @param caseName Tên vụ án
     * @param initialState Trạng thái ban đầu của vụ án
     */
    public Lawsuit(String caseName, State initialState) {
        this.caseName = caseName;
        this.currentState = initialState;
        System.out.println("Vụ án '" + caseName + "' được khởi tạo ở trạng thái: " + currentState.getStateName());
    }
    
    /**
     * Thiết lập trạng thái hiện tại của vụ án
     * @param state Trạng thái mới
     */
    public void setState(State state) {
        System.out.println("Vụ án '" + caseName + "' chuyển từ trạng thái: " + 
                          (currentState != null ? currentState.getStateName() : "Chưa có") + 
                          " sang trạng thái: " + state.getStateName());
        this.currentState = state;
    }
    
    /**
     * Chuyển vụ án sang trạng thái tiếp theo bằng cách gọi handle của trạng thái hiện tại
     */
    public void nextState() {
        if (currentState != null) {
            currentState.handle(this);
        } else {
            System.out.println("Lỗi: Vụ án chưa được thiết lập trạng thái!");
        }
    }
    
    /**
     * Lấy tên của vụ án
     * @return Tên vụ án
     */
    public String getCaseName() {
        return caseName;
    }
    
    /**
     * Lấy trạng thái hiện tại của vụ án
     * @return Trạng thái hiện tại
     */
    public State getCurrentState() {
        return currentState;
    }
} 