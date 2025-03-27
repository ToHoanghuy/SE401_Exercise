package BT10_Facade;

/**
 * Facade class that simplifies the order processing system
 */
public class DonHangFacade {
    private KiemTraTonKho kiemTraTonKho;
    private XuLyThanhToan xuLyThanhToan;
    private VanChuyen vanChuyen;
    
    /**
     * Constructor for DonHangFacade
     * Initializes all subsystem components
     */
    public DonHangFacade() {
        this.kiemTraTonKho = new KiemTraTonKho();
        this.xuLyThanhToan = new XuLyThanhToan();
        this.vanChuyen = new VanChuyen();
    }
    
    /**
     * Process an order from start to finish
     * This is the main method that clients will use
     * @param donHang the order to process
     * @return true if the order was processed successfully
     */
    public boolean xuLyDonHang(DonHang donHang) {
        System.out.println("===== BẮT ĐẦU XỬ LÝ ĐƠN HÀNG " + donHang.getMaDonHang() + " =====");
        
        // Step 1: Check inventory
        boolean sanPhamCoSan = kiemTraTonKho.kiemTraSanPham(
            donHang.getMaSanPham(), 
            donHang.getSoLuong()
        );
        
        if (!sanPhamCoSan) {
            System.out.println("Không thể xử lý đơn hàng do sản phẩm không có sẵn.");
            return false;
        }
        
        // Step 2: Process payment
        boolean thanhToanThanhCong = xuLyThanhToan.thanhToan(
            donHang.getMaKhachHang(), 
            donHang.tinhTongTien()
        );
        
        if (!thanhToanThanhCong) {
            System.out.println("Không thể xử lý đơn hàng do thanh toán thất bại.");
            return false;
        }
        
        // Step 3: Arrange shipping
        boolean vanChuyenThanhCong = vanChuyen.sapXepVanChuyen(
            donHang.getMaDonHang(), 
            donHang.getDiaChi()
        );
        
        if (!vanChuyenThanhCong) {
            System.out.println("Không thể xử lý đơn hàng do không thể sắp xếp vận chuyển.");
            // In a real system, we might need to refund the payment here
            return false;
        }
        
        System.out.println("===== ĐƠN HÀNG " + donHang.getMaDonHang() + " ĐÃ ĐƯỢC XỬ LÝ THÀNH CÔNG =====");
        return true;
    }
}
