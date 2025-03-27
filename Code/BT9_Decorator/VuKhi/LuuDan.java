package BT9_Decorator.VuKhi;

import BT9_Decorator.Linh;
import BT9_Decorator.LinhDecorator;

/**
 * Concrete decorator for adding grenades to a soldier
 */
public class LuuDan extends LinhDecorator {
    /**
     * Constructor for LuuDan decorator
     * @param linhDecorated the soldier to be decorated
     */
    public LuuDan(Linh linhDecorated) {
        super(linhDecorated);
    }
    
    @Override
    public String getItem() {
        return super.getItem() + ", Lựu đạn";
    }
}
