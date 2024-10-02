
public class ShippingHandler extends OrderHandler {
    @Override
    public void handleOrder(Order order) {
        if (order.isPaid() && order.isInStock()) {
            order.setShipped(true);
            System.out.println("Order has been shipped.");
        } else {
            System.out.println("Cannot ship the order.");
        }
    }
}
