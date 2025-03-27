package BT9_Decorator.QuanHam;

import BT9_Decorator.Linh;
import BT9_Decorator.LinhDecorator;

/**
 * Concrete decorator for adding private rank to a soldier
 */
public class QuanNhan extends LinhDecorator {
    /**
     * Constructor for QuanNhan decorator
     * @param linhDecorated the soldier to be decorated
     */
    public QuanNhan(Linh linhDecorated) {
        super(linhDecorated);
    }
    
    @Override
    public String getItem() {
        return super.getItem() + ", Quân hàm: Quân nhân";
    }
}
