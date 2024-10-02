
public class InventoryHandler extends OrderHandler {
    @Override
    public void handleOrder(Order order) {
        if (order.isInStock()) {
            System.out.println("Order is in stock.");
        } else {
            System.out.println("Order out of stock.");
            return;
        }
        if (nextHandler != null) {
            nextHandler.handleOrder(order);
        }
    }
}
