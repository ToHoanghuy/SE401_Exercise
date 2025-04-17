package BT18_State;

/**
 * Interface State định nghĩa các hành vi chung của tất cả các trạng thái vụ án
 */
public interface State {
    /**
     * Xác định hành vi khi vụ án ở trạng thái hiện tại
     * @param lawsuit Lawsuit (vụ án) đang được xử lý
     */
    void handle(Lawsuit lawsuit);
    
    /**
     * Trả về tên của trạng thái
     * @return Tên trạng thái
     */
    String getStateName();
} 