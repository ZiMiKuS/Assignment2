import java.util.ArrayList;
import java.util.List;

class Admin extends User {
    List<Product> products;

    public Admin(int userId, String name, String email) {
        super(userId, name, email);
        this.products = new ArrayList<>();
    }

    @Override
    public void displayDetails() {
        System.out.println("Admin Name: " + name);
        System.out.println("Email: " + email);
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    public void removeProduct(String productId) {
        products.removeIf(p -> p.getProductId().equals(productId));
        System.out.println("Product removed with ID: " + productId);
    }

    public void updateStock(String productId, int newStock) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                product.setStock(newStock);
                System.out.println("Stock updated for product: " + productId);
            }
        }
    }
}
