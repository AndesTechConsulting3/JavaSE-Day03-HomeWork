package learning;

public class App
{
    public static void main(String[] args )
    {
        Customer customer1 = new Customer("Elena", "Terentjeva", "Moskva, Miloshenko, d. 30");
        Account account1= new Account(1,30000, customer1);

        account1.printAccountInfo();
    }
}