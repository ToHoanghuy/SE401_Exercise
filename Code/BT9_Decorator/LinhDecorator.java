package BT9_Decorator;

/**
 * Abstract decorator class for Linh (Decorator in Decorator pattern)
 */
public abstract class LinhDecorator implements Linh {
    protected Linh linhDecorated;
    
    /**
     * Constructor for LinhDecorator
     * @param linhDecorated the soldier to be decorated
     */
    public LinhDecorator(Linh linhDecorated) {
        this.linhDecorated = linhDecorated;
    }
    
    @Override
    public String getItem() {
        return linhDecorated.getItem();
    }
}
