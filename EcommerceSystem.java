import Ecommerce.Product;
import Ecommerce.Customer;
import Ecommerce.Order;

class EcommerceSystem {
    public static void main(String args[]) {
        Product p1 = new Product(24, "Laptop", 55000.0);
        Customer c1 = new Customer(1, "Shravani Patil");
        Order o1 = new Order(c1, p1, 2);

        o1.placeOrder();
    }
}
