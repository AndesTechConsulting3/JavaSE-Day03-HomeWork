package ru.raiffeisen.learning;

public class Account {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= minBalance && balance <= maxBalance)
            this.balance = balance;
    }

    public static int getMinBalance() {
        return minBalance;
    }

    public static int getMaxBalance() {
        return maxBalance;
    }

    public Customer customer;
    private static final int minBalance=0;
    private static final int maxBalance=200000000;

    public Account(int id, int balance, Customer customer) {
        this.id = id;
        this.balance = balance;
        this.customer = customer;
    }


    private String getAccountInfо(){
        return
                "ID: " + id + ", " +
                        "Customer: " + customer.getCustomerInfо() + ", " +
                        "Balance: " + balance;
    }

    public void printAccountInfo(){
        System.out.println(getAccountInfо());
    }


}