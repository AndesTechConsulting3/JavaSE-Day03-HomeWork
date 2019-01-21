package ru.raiffeisen.ruatde6;

public class Account {

    private int id;

    private Customer customer;

    private int balance;

    private static int minBalance = 0;

    private static int maxBalance = 1000000;

    public Account(int id, Customer customer, int balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public String printAccountInfo() {
        return "ID: " + id + ", \nName: " + customer.getFirstName() + ", \nSurname: " + customer.getSecondName() +  ", \nAddress: " + customer.getAddress() +  ", \nBALANCE: " + balance;
    }
    public String getUserName() {
        return customer.getFirstName();
    }

    public void setUserName(String userName) {
        this.customer.setFirstName(userName);
    }

    public String getUserSName() {
        return customer.getSecondName();
    }

    public void setUserSName(String userSName) {
        this.customer.setSecondName(userSName);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= minBalance && balance <= maxBalance)
        this.balance = balance;
    }
}
