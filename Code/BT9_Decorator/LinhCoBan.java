package BT9_Decorator;

/**
 * Concrete implementation of Linh interface (ConcreteComponent in Decorator pattern)
 * Represents a basic soldier with standard equipment
 */
public class LinhCoBan implements Linh {
    private String ten;
    
    /**
     * Constructor for a basic soldier
     * @param ten name of the soldier
     */
    public LinhCoBan(String ten) {
        this.ten = ten;
    }
    
    @Override
    public String getItem() {
        return "Lính " + ten + " được trang bị: [Quần áo cơ bản, Balo, Nón]";
    }
}
