import java.util.ArrayList;
import java.util.List;

class Customer extends User {
    List<Order> orders;
    String shippingAddress;

    public Customer(int userId, String name, String email, String shippingAddress) {
        super(userId, name, email);
        this.orders = new ArrayList<>();
        this.shippingAddress = shippingAddress;
    }

    @Override
    public void displayDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Shipping Address: " + shippingAddress + '\n');
    }

    public void placeOrder(Product product, int quantity) {
        if (product.getStock() >= quantity) {
            Order order = new Order(this, product, quantity);
            orders.add(order);
            product.reduceStock(quantity);
            System.out.println("Order placed: " + order.orderId);
        } else {
            System.out.println("Not enough stock");
        }
    }
    public void cancelOrder(String orderId) {
        Order orderToCancel = null;
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                orderToCancel = order;
                break;
            }
        }

        if (orderToCancel == null) {
            System.out.println("Order with ID " + orderId + " not found.");
            return;
        }

        orderToCancel.cancelOrder();
        orderToCancel.getProduct().increaseStock(orderToCancel.getQuantity());
        System.out.println("Order " + orderId + " has been successfully cancelled.");
    }

}
