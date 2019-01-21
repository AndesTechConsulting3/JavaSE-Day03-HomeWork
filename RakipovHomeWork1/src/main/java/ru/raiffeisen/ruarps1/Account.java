package ru.raiffeisen.ruarps1;

public class Account {

    private static int minBalance = 0, maxBalance = 100000;
    private int balance;
    private String account;
    Customer customer;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= minBalance && balance <= maxBalance) this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Account(String account, int balance, Customer customer){

        this.balance = balance;
        this.account = account;
        this.customer = customer;

    }

    private String getAccountInf(){

        return

                "Account: " + " " + account +
                "balance: " + " " + balance +
                "Customer: " + " " + customer;
    }

    public void printAccountInf(){

        System.out.println(getAccountInf());
    }

}
