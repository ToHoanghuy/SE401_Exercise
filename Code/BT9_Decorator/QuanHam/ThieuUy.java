package BT9_Decorator.QuanHam;

import BT9_Decorator.Linh;
import BT9_Decorator.LinhDecorator;

/**
 * Concrete decorator for adding second lieutenant rank to a soldier
 */
public class ThieuUy extends LinhDecorator {
    /**
     * Constructor for ThieuUy decorator
     * @param linhDecorated the soldier to be decorated
     */
    public ThieuUy(Linh linhDecorated) {
        super(linhDecorated);
    }
    
    @Override
    public String getItem() {
        return super.getItem() + ", Quân hàm: Thiếu úy";
    }
}
