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
        System.out.println("Shipping Address: " + shippingAddress);
    }

    public void placeOrder(Product product, int quantity) {
        if (product.getStock() >= quantity) {
            Order order = new Order("ORD" + (orders.size() + 1), this, product, quantity);
            orders.add(order);
            product.reduceStock(quantity);
            System.out.println("Order placed: " + order.orderId);
        } else {
            System.out.println("Not enough stock");
        }
    }

    public void cancelOrder(Order order) {
        order.cancelOrder();
        orders.remove(order);
        order.product.increaseStock(order.quantity);
    }
}
