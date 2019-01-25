package ru.raiffeisen.okovity.homework;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Customer customer = new Customer("Vitaly", "Okovity", "Kashirskoe highway 102/2");

        Account account = new Account(1, customer, 9999999);

        System.out.println(account.printAccountInfo());
    }
}