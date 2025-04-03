import java.util.ArrayList;
import java.util.List;

public class ClothingStoreDemo {
    public static void main(String[] args) {
        // Tạo danh sách các sản phẩm thời trang
        List<ClothingItem> catalog = new ArrayList<>();
        catalog.add(new ClothingItem("Áo thun nam", 299000, "ao_thun.jpg"));
        catalog.add(new ClothingItem("Quần jean nữ", 599000, "quan_jean.jpg"));
        catalog.add(new ClothingItem("Áo khoác denim", 899000, "ao_khoac.jpg"));

        // Hiển thị danh sách sản phẩm (chưa tải ảnh)
        System.out.println("=== Danh sách sản phẩm ===");
        for (ClothingItem item : catalog) {
            System.out.println(item);
        }

        // Giả lập việc người dùng chọn xem chi tiết sản phẩm
        System.out.println("\n=== Chi tiết sản phẩm được chọn ===");
        ClothingItem selectedItem = catalog.get(0);
        System.out.println("Đang tải ảnh cho sản phẩm: " + selectedItem.getName());
        selectedItem.displayImage();
    }
} 