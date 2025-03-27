package BT9_Decorator.KyNang;

import BT9_Decorator.Linh;
import BT9_Decorator.LinhDecorator;

/**
 * Concrete decorator for adding shooting skill to a soldier
 */
public class Ban extends LinhDecorator {
    /**
     * Constructor for Ban decorator
     * @param linhDecorated the soldier to be decorated
     */
    public Ban(Linh linhDecorated) {
        super(linhDecorated);
    }
    
    @Override
    public String getItem() {
        return super.getItem() + ", Kỹ năng bắn";
    }
}
