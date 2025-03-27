package BT9_Decorator.KyNang;

import BT9_Decorator.Linh;
import BT9_Decorator.LinhDecorator;

/**
 * Concrete decorator for adding cooking skill to a soldier
 */
public class NauAn extends LinhDecorator {
    /**
     * Constructor for NauAn decorator
     * @param linhDecorated the soldier to be decorated
     */
    public NauAn(Linh linhDecorated) {
        super(linhDecorated);
    }
    
    @Override
    public String getItem() {
        return super.getItem() + ", Kỹ năng nấu ăn";
    }
}
