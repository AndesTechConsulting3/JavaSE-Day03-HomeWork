package learning;

public class Account {


    private int id;
    private int balance;


    public void setBalance(int balance) {
        if (balance >= minBalance && balance <= maxBalance)
            this.balance = balance;
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