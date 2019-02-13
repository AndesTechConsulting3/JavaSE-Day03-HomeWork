package learning;

public class Customer {

    private String firstName;

    private String secondName;
    private String address;

    public Customer(String firstName, String secondName, String address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
    }

    public String getCustomerInfо(){
        return
                "First Name: " + firstName + ", " +
                        "Second Name: " + secondName  + "," +
                        "Address: " + address;
    }


}