package HomeWork3;

public class Account {

    private static int minBal=0, maxBal=6000000;

    private int balance;
    private String account;

    Customer customer;

    public int getBalance() {
        return balance;
    }

    public String getAccount() {
        return account;
    }

    public void setBalance(int balance){
        if(balance >= minBal && balance <= maxBal ) this.balance = balance;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Account(String account, int balance, Customer customer) {
        this.balance = balance;
        this.account = account;
        this.customer = customer;
    }

    private String getAccountinfo(){
        return "Account: " + account +
                ", Balance: " + balance +
                ", Customer: " + customer;}

    public void printAccountInfo(){
        System.out.println(getAccountinfo());
    }
}
