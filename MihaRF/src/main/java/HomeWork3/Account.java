package HomeWork3;

public class Account {

    private static int minBal=0, maxBal=15000;

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
                else System.out.println("Balance failed!");
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Account(String account, int balance, Customer customer) {
        this.account = account;
        this.customer = customer;
        if(balance >= minBal && balance <= maxBal ) this.balance = balance;
        else System.out.println("Balance failed!");
    }

    private String getAccountinfo(){
        return "Account: " + account +
                ", Balance: " + balance +
                ", Customer: " + customer;}

    public void printAccountInfo(){
        System.out.println(getAccountinfo());
    }

    public String printAccountInfoFull() {
        return "Name: " + customer.getFirstName() + ", \nSurname: " + customer.getSecondName() +
                ", \nAddress: " + customer.getAddress() +  ", \nBalance: " + balance +  ", \nAccount: " + account;
    }
}
