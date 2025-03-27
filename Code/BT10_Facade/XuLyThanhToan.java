package BT10_Facade;

/**
 * Subsystem class for payment processing
 */
public class XuLyThanhToan {
    /**
     * Process payment for an order
     * @param maKhachHang customer ID
     * @param tongTien total amount to be paid
     * @return true if payment is successful
     */
    public boolean thanhToan(String maKhachHang, double tongTien) {
        // In a real system, this would connect to a payment gateway
        System.out.println("Xử lý thanh toán cho khách hàng " + maKhachHang + " với số tiền " + tongTien + " VND");
        
        // Simulate payment processing with some logic
        // For demonstration, payments less than 10,000,000 VND are always successful
        if (tongTien < 10000000) {
            System.out.println("Thanh toán thành công cho đơn hàng.");
            return true;
        } else {
            // For larger amounts, simulate a check on customer ID
            if (maKhachHang.startsWith("KH")) {
                System.out.println("Thanh toán thành công cho đơn hàng.");
                return true;
            } else {
                System.out.println("Thanh toán thất bại. Vui lòng kiểm tra lại thông tin thanh toán.");
                return false;
            }
        }
    }
}
