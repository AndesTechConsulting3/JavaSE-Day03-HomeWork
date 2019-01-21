package ru.raiffeisen.ruatde6;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer customer = new Customer("Alexey", "Ivanov", "g.Moskva ul.Polezhaevskaya d.10 kv.89");

        Account account = new Account(1, customer, 10000);

        System.out.println(account.printAccountInfo());
    }
}
