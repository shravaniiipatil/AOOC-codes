package Ecommerce;
public class Order 
{
    Customer customer;
    Product product;
    int quantity;

    public Order(Customer c, Product p, int q) 
    {
        customer = c;
        product = p;
        quantity = q;
    }

    public void placeOrder() {
        System.out.println("\nOrder Placed Successfully!");
        customer.showCustomer();
        product.showProduct();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: Rs." + (product.price * quantity));
        System.out.println("------------------------------");
    }
}
