package BT9_Decorator.KyNang;

import BT9_Decorator.Linh;
import BT9_Decorator.LinhDecorator;

/**
 * Concrete decorator for adding healing skill to a soldier
 */
public class ChuaTri extends LinhDecorator {
    /**
     * Constructor for ChuaTri decorator
     * @param linhDecorated the soldier to be decorated
     */
    public ChuaTri(Linh linhDecorated) {
        super(linhDecorated);
    }
    
    @Override
    public String getItem() {
        return super.getItem() + ", Kỹ năng chữa trị";
    }
}
