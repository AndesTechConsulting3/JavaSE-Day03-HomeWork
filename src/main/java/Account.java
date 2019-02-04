public class Account {


    Customer customer = new Customer();

    public Account(Customer customer) {
        this.customer = customer;

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


}


