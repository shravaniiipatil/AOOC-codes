package Ecommerce;
public class Customer 
{
    String name;
    int customerId;

    public Customer(int id, String n) 
    {
        customerId = id;
        name = n;
    }

    public void showCustomer() 
    {
        System.out.println("Customer ID: " + customerId + ", Name: " + name);
    }
}
