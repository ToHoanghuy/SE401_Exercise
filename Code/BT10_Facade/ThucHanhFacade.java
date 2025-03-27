package BT10_Facade;

/**
 * Demo class to test the Facade Pattern for e-commerce order system
 */
public class ThucHanhFacade {
    public static void main(String[] args) {
        // Create the facade
        DonHangFacade donHangFacade = new DonHangFacade();
        
        System.out.println("===== DEMO HỆ THỐNG ĐẶT HÀNG THƯƠNG MẠI ĐIỆN TỬ =====\n");
        
        // Create some test orders
        DonHang donHang1 = new DonHang(
            "DH001", 
            "KH001", 
            "SP001", 
            2, 
            1500000, 
            "123 Nguyễn Văn Linh, Quận 7, TP.HCM"
        );
        
        DonHang donHang2 = new DonHang(
            "DH002", 
            "KH002", 
            "ABC123", // Invalid product ID (doesn't start with "SP")
            1, 
            2000000, 
            "456 Lê Lợi, Quận 1, TP.HCM"
        );
        
        DonHang donHang3 = new DonHang(
            "DH003", 
            "XYZ003", // Invalid customer ID (doesn't start with "KH")
            "SP003", 
            3, 
            5000000, 
            "789 Điện Biên Phủ, Quận 3, TP.HCM"
        );
        
        DonHang donHang4 = new DonHang(
            "DH004", 
            "KH004", 
            "SP004", 
            1, 
            1000000, 
            "" // Invalid address
        );
        
        // Process the orders using the facade
        System.out.println("TRƯỜNG HỢP 1: ĐƠN HÀNG HỢP LỆ");
        donHangFacade.xuLyDonHang(donHang1);
        
        System.out.println("\nTRƯỜNG HỢP 2: SẢN PHẨM KHÔNG CÓ SẴN");
        donHangFacade.xuLyDonHang(donHang2);
        
        System.out.println("\nTRƯỜNG HỢP 3: THANH TOÁN THẤT BẠI");
        donHangFacade.xuLyDonHang(donHang3);
        
        System.out.println("\nTRƯỜNG HỢP 4: ĐỊA CHỈ GIAO HÀNG KHÔNG HỢP LỆ");
        donHangFacade.xuLyDonHang(donHang4);
    }
}
