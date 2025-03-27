package BT10_Facade;

/**
 * Class representing an order in the e-commerce system
 */
public class DonHang {
    private String maDonHang;
    private String maKhachHang;
    private String maSanPham;
    private int soLuong;
    private double donGia;
    private String diaChi;
    
    /**
     * Constructor for an order
     * @param maDonHang order ID
     * @param maKhachHang customer ID
     * @param maSanPham product ID
     * @param soLuong quantity
     * @param donGia unit price
     * @param diaChi shipping address
     */
    public DonHang(String maDonHang, String maKhachHang, String maSanPham, int soLuong, double donGia, String diaChi) {
        this.maDonHang = maDonHang;
        this.maKhachHang = maKhachHang;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.diaChi = diaChi;
    }
    
    /**
     * Get the order ID
     * @return order ID
     */
    public String getMaDonHang() {
        return maDonHang;
    }
    
    /**
     * Get the customer ID
     * @return customer ID
     */
    public String getMaKhachHang() {
        return maKhachHang;
    }
    
    /**
     * Get the product ID
     * @return product ID
     */
    public String getMaSanPham() {
        return maSanPham;
    }
    
    /**
     * Get the quantity
     * @return quantity
     */
    public int getSoLuong() {
        return soLuong;
    }
    
    /**
     * Get the unit price
     * @return unit price
     */
    public double getDonGia() {
        return donGia;
    }
    
    /**
     * Get the shipping address
     * @return shipping address
     */
    public String getDiaChi() {
        return diaChi;
    }
    
    /**
     * Calculate the total amount for the order
     * @return total amount
     */
    public double tinhTongTien() {
        return soLuong * donGia;
    }
}
