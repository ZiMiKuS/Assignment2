public class ECommerceSystem {

    public static void main(String[] args) {
        Admin admin1 = new Admin(1, "Admin1", "admin1@example.com");
        Admin admin2 = new Admin(2, "Admin2", "admin2@example.com");

        Product p1 = new Product("P001", "T-Shirt", 5.00, 100);
        Product p2 = new Product("P002", "Trousers", 10.00, 150);

        admin1.addProduct(p1);
        admin1.addProduct(p2);

        Customer c1 = new Customer(1, "Customer1", "customer1@example.com", "Address1");
        Customer c2 = new Customer(2, "Customer2", "customer2@example.com", "Address2");

        c1.placeOrder(p1, 2);
        c2.placeOrder(p2, 5);

        c2.cancelOrder("ORD2");

        System.out.println("\n--- All Products ---");
        p1.displayDetails();
        p2.displayDetails();
        
        System.out.println("\n--- Orders ---");
        c1.orders.get(0).displayOrderDetails();
        c2.orders.get(0).displayOrderDetails();

        System.out.println("\n--- All Users ---");
        c1.displayDetails();
        c2.displayDetails();
    }
}
