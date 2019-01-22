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

        Account account = new Account("12345678900987654321", 10500, customer);
        account.printAccountInfo();
        System.out.println("--------------------------------");
        System.out.println(account.printAccountInfoFull());
        System.out.println("--------------------------------");
        account.setBalance(100500);
        System.out.println(account.getBalance());//ту мач, не присвоено, потому выводится прошлое присвоенное значение
    }
}
