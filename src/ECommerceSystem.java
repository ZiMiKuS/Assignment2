public class ECommerceSystem {

    public static void main(String[] args) {
        Admin admin1 = new Admin(1, "Admin1", "admin1@example.com");
        Admin admin2 = new Admin(2, "Admin2", "admin2@example.com");

        Product product1 = new Product("P001", "T-Shirt", 5.00, 100);
        Product product2 = new Product("P002", "Trousers", 10.00, 150);

        admin1.addProduct(product1);
        admin1.addProduct(product2);

        Customer customer1 = new Customer(1, "Customer1", "customer1@example.com", "Address1");
        Customer customer2 = new Customer(2, "Customer2", "customer2@example.com", "Address2");

        customer1.placeOrder(product1, 2);
        customer2.placeOrder(product2, 5);

        customer2.cancelOrder("ORD2");

        customer2.placeOrder(product2, 8);

        System.out.println("\n--- All Users ---");
        customer1.displayDetails();
        customer2.displayDetails();

        System.out.println("\n--- Orders ---");
        customer1.orders.getFirst().displayOrderDetails();
        customer2.orders.get(0).displayOrderDetails();
        customer2.orders.get(1).displayOrderDetails();

        System.out.println("\n--- All Products ---");
        product1.displayDetails();
        product2.displayDetails();
    }
}
