public class Account {

    private int id;
    private int balance;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    private String customer;

    private static int minBalance = 100, maxBalance = 1000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int account) {
        if (balance >= minBalance && balance <= maxBalance)
            this.balance = account;
    }

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
        this.customer = customer;
    }

    private String getAccountUser() {
        return
                "id: " + id + ", balace: " + balance + ", nameUser: " +
                        ", userSname: ";
    }

    public void printUserAccout() {
        System.out.println(getAccountUser());
    }
}
