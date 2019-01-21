package ru.raiffeisen.learning;

public class Customer {

    private String firstName;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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

//    public void printCustomerInfo(){
//        System.out.println(getCustomerInfо());
//    }
}
