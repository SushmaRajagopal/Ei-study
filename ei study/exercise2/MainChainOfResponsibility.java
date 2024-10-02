
public class MainChainOfResponsibility {
    public static void main(String[] args) {
        Order order = new Order(1000, true);

        PaymentHandler paymentHandler = new PaymentHandler();
        InventoryHandler inventoryHandler = new InventoryHandler();
        ShippingHandler shippingHandler = new ShippingHandler();

        paymentHandler.setNextHandler(inventoryHandler);
        inventoryHandler.setNextHandler(shippingHandler);

        paymentHandler.handleOrder(order);
    }
}
