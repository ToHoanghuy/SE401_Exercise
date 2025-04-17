package BT18_State;

/**
 * Lớp Main dùng để chạy chương trình và minh họa việc sử dụng mẫu thiết kế State
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== CHƯƠNG TRÌNH QUẢN LÝ TRẠNG THÁI VỤ ÁN =====");
        
        // Tạo một vụ án mới với trạng thái ban đầu là Khởi Kiện
        Lawsuit lawsuit = new Lawsuit("Nguyễn Văn A kiện Công ty XYZ", new FilingState());
        
        System.out.println("\n----- Tiến trình vụ án -----");
        
        // Chuyển qua các trạng thái khác nhau
        lawsuit.nextState(); // Chuyển từ Khởi Kiện sang Đang Xét Xử
        lawsuit.nextState(); // Chuyển từ Đang Xét Xử sang Chờ Phán Quyết
        lawsuit.nextState(); // Chuyển từ Chờ Phán Quyết sang Đã Hoàn Tất
        lawsuit.nextState(); // Thử chuyển từ Đã Hoàn Tất (không có tác dụng)
        
        System.out.println("\n===== Kết thúc chương trình =====");
    }
} 