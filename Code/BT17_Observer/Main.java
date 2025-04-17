package BT17_Observer;

public class Main {
    public static void main(String[] args) {
        // Tạo một đơn hàng mới
        Order order = new Order();

        // Tạo các khách hàng
        Customer customer1 = new RestaurantCustomer("Nguyễn Văn A");
        Customer customer2 = new RestaurantCustomer("Trần Thị B");

        // Đăng ký các khách hàng để nhận thông báo
        order.registerCustomer(customer1);
        order.registerCustomer(customer2);

        // Cập nhật trạng thái đơn hàng
        System.out.println("=== Cập nhật trạng thái đơn hàng ===");
        order.updateStatus("đã sẵn sàng để giao");
        
        // Hủy đăng ký một khách hàng
        order.removeCustomer(customer1);
        
        System.out.println("\n=== Sau khi khách hàng A hủy đăng ký ===");
        order.updateStatus("đang giao hàng");
        
        System.out.println("\n=== Cập nhật trạng thái cuối cùng ===");
        order.updateStatus("hoàn tất");
    }
} 