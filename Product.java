package Ecommerce;
public class Product 
{
    String name;
    double price;
    int productId;

    public Product(int id, String n, double p) 
    {
        productId = id;
        name = n;
        price = p;
    }

    public void showProduct() 
    {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: Rs." + price);
    }
}
