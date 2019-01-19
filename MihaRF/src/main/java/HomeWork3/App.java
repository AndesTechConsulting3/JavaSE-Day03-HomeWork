package HomeWork3;

/**
 * Hello world!
 * @mytest
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer customer = new Customer("Sheldon","Cooper","USA, CA, Pasadena");
        customer.printCustomerInfo();

        Account account = new Account("12345678900987654321", 100500, customer);
        account.printAccountInfo();
    }
}
