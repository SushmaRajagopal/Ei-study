
public abstract class OrderHandler {
    protected OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleOrder(Order order);
}
