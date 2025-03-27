package BT10_Facade;

/**
 * Subsystem class for shipping arrangement
 */
public class VanChuyen {
    /**
     * Arrange shipping for an order
     * @param maDonHang order ID
     * @param diaChi shipping address
     * @return true if shipping arrangement is successful
     */
    public boolean sapXepVanChuyen(String maDonHang, String diaChi) {
        // In a real system, this would connect to a shipping service
        System.out.println("Sắp xếp vận chuyển cho đơn hàng " + maDonHang + " đến địa chỉ: " + diaChi);
        
        // Simulate shipping arrangement with some logic
        // For demonstration, all shipping arrangements are successful if address is provided
        if (diaChi != null && !diaChi.isEmpty()) {
            System.out.println("Đã sắp xếp vận chuyển thành công. Đơn hàng sẽ được giao trong 3-5 ngày làm việc.");
            return true;
        } else {
            System.out.println("Không thể sắp xếp vận chuyển. Địa chỉ không hợp lệ.");
            return false;
        }
    }
}
