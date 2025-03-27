package BT9_Decorator;

import BT9_Decorator.KyNang.Ban;
import BT9_Decorator.KyNang.ChuaTri;
import BT9_Decorator.KyNang.NauAn;
import BT9_Decorator.QuanHam.QuanNhan;
import BT9_Decorator.QuanHam.ThieuUy;
import BT9_Decorator.QuanHam.TrungUy;
import BT9_Decorator.VuKhi.AoGiap;
import BT9_Decorator.VuKhi.LuuDan;
import BT9_Decorator.VuKhi.Sung;

/**
 * Demo class to test the Decorator Pattern for soldier simulation
 */
public class QuanDoiDemo {
    public static void main(String[] args) {
        // Tạo một người lính cơ bản
        System.out.println("=== NGƯỜI LÍNH CƠ BẢN ===");
        Linh linhCoBan = new LinhCoBan("Nguyễn Văn A");
        System.out.println(linhCoBan.getItem());
        System.out.println();
        
        // Tạo một người lính được trang bị vũ khí
        System.out.println("=== NGƯỜI LÍNH VỚI VŨ KHÍ ===");
        Linh linhCoVuKhi = new LuuDan(new AoGiap(new Sung(new LinhCoBan("Trần Văn B"))));
        System.out.println(linhCoVuKhi.getItem());
        System.out.println();
        
        // Tạo một người lính có kỹ năng
        System.out.println("=== NGƯỜI LÍNH VỚI KỸ NĂNG ===");
        Linh linhCoKyNang = new Ban(new ChuaTri(new NauAn(new LinhCoBan("Lê Văn C"))));
        System.out.println(linhCoKyNang.getItem());
        System.out.println();
        
        // Tạo một người lính có quân hàm
        System.out.println("=== NGƯỜI LÍNH VỚI QUÂN HÀM ===");
        Linh linhCoQuanHam = new TrungUy(new LinhCoBan("Phạm Văn D"));
        System.out.println(linhCoQuanHam.getItem());
        System.out.println();
        
        // Tạo một người lính đầy đủ trang bị, kỹ năng và quân hàm
        System.out.println("=== NGƯỜI LÍNH ĐẦY ĐỦ ===");
        Linh linhDayDu = new QuanNhan(
                            new Sung(
                                new AoGiap(
                                    new Ban(
                                        new ChuaTri(
                                            new LinhCoBan("Hoàng Văn E"))))));
        System.out.println(linhDayDu.getItem());
        System.out.println();
        
        // Tạo một người lính cấp bậc cao với nhiều trang bị và kỹ năng
        System.out.println("=== NGƯỜI LÍNH CẤP BẬC CAO ===");
        Linh linhCapCao = new ThieuUy(
                            new Sung(
                                new AoGiap(
                                    new LuuDan(
                                        new Ban(
                                            new NauAn(
                                                new LinhCoBan("Vũ Văn F")))))));
        System.out.println(linhCapCao.getItem());
    }
}
