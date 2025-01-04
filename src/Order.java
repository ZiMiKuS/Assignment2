class Order {
    String orderId;
    Customer customer;
    Product product;
    int quantity;
    double totalPrice;
    String status;

    public Order(String orderId, Customer customer, Product product, int quantity) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = product.getPrice() * quantity;
        this.status = "Placed";
    }

    public void cancelOrder() {
        status = "Cancelled";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.name);
        System.out.println("Product: " + product.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Status: " + status);
    }
}
