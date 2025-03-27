package BT9_Decorator.VuKhi;

import BT9_Decorator.Linh;
import BT9_Decorator.LinhDecorator;

/**
 * Concrete decorator for adding armor to a soldier
 */
public class AoGiap extends LinhDecorator {
    /**
     * Constructor for AoGiap decorator
     * @param linhDecorated the soldier to be decorated
     */
    public AoGiap(Linh linhDecorated) {
        super(linhDecorated);
    }
    
    @Override
    public String getItem() {
        return super.getItem() + ", Áo giáp";
    }
}
