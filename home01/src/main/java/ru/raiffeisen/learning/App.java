package ru.raiffeisen.learning;

public class App 
{
    public static void main(String[] args )
    {
        Customer cust01 = new Customer("Elena", "Terentjeva", "Moskva, Miloshenko, d. 30");
        Account acc01= new Account(1,30000, cust01);

        acc01.printAccountInfo();
    }
}
