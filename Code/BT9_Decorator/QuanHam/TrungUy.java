package BT9_Decorator.QuanHam;

import BT9_Decorator.Linh;
import BT9_Decorator.LinhDecorator;

/**
 * Concrete decorator for adding first lieutenant rank to a soldier
 */
public class TrungUy extends LinhDecorator {
    /**
     * Constructor for TrungUy decorator
     * @param linhDecorated the soldier to be decorated
     */
    public TrungUy(Linh linhDecorated) {
        super(linhDecorated);
    }
    
    @Override
    public String getItem() {
        return super.getItem() + ", Quân hàm: Trung úy";
    }
}
