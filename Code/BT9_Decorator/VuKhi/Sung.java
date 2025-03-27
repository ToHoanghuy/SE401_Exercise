package BT9_Decorator.VuKhi;

import BT9_Decorator.Linh;
import BT9_Decorator.LinhDecorator;

/**
 * Concrete decorator for adding a gun to a soldier
 */
public class Sung extends LinhDecorator {
    /**
     * Constructor for Sung decorator
     * @param linhDecorated the soldier to be decorated
     */
    public Sung(Linh linhDecorated) {
        super(linhDecorated);
    }
    
    @Override
    public String getItem() {
        return super.getItem() + ", Súng";
    }
}
