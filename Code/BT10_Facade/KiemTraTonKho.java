package BT10_Facade;

/**
 * Subsystem class for checking inventory
 */
public class KiemTraTonKho {
    /**
     * Check if a product is available in inventory
     * @param maSanPham product ID
     * @param soLuong quantity requested
     * @return true if the product is available in the requested quantity
     */
    public boolean kiemTraSanPham(String maSanPham, int soLuong) {
        // In a real system, this would check a database or inventory system
        System.out.println("Kiểm tra tồn kho cho sản phẩm " + maSanPham + " với số lượng " + soLuong);
        
        // Simulate inventory check with some logic
        // For demonstration, products with ID starting with "SP" are available
        if (maSanPham.startsWith("SP") && soLuong > 0) {
            System.out.println("Sản phẩm " + maSanPham + " có sẵn với số lượng yêu cầu.");
            return true;
        } else {
            System.out.println("Sản phẩm " + maSanPham + " không có sẵn với số lượng yêu cầu.");
            return false;
        }
    }
}
