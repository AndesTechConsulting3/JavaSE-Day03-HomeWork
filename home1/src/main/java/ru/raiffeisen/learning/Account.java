package ru.raiffeisen.learning;

public class Account {

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer customer) {
        this.Customer = customer;
    }

    public Customer Customer;

    public Account(int balance, int id, Customer Customer) {
        this.Customer = Customer;
        this.balance = balance;
        this.id = id;
    }

    private int balance;
    private static final int minbalance=19, maxbalance=2000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= minbalance && balance <= maxbalance)this.balance = balance;}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    private  String getreport()
    {
        return
                "balance: " + balance + ", id: " + id + ", username:" + Customer.getCustomer() + ".";
    }

    public void printinfo()
    {
        System.out.println(getreport());

    }

}
