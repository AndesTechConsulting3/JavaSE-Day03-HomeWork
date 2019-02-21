package HomeWork1;

public class Customer {

    private String firstName;
    private String secondName;
    private String adress;

    public Customer() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Customer(String firstName, String lastName, String adress) {
        this();
        this.firstName = firstName;
        this.secondName = lastName;
        this.adress = adress;
    }

    public String getCustomerInfo(){
        String customerInfo = "First name: " + firstName +
                "\nSecond name: " + secondName +
                "\nAdress: " + adress;

        return customerInfo;
    }

    public void printCustomersInfo(){
        System.out.println(getCustomerInfo());
    }



}
