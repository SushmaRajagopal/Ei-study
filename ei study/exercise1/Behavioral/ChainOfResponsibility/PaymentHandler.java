
public class PaymentHandler extends OrderHandler {
    @Override
    public void handleOrder(Order order) {
        if (order.getAmount() > 0) {
            order.setPaid(true);
            System.out.println("Payment processed: " + order.getAmount());
        }
        if (nextHandler != null) {
            nextHandler.handleOrder(order);
        }
    }
}
