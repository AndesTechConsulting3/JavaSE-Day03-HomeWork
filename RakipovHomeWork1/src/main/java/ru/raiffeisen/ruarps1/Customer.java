package ru.raiffeisen.ruarps1;

public class Customer {

    String firstName, secondName, address;

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

    private String adress;

    public Customer(String firstName, String secondName, String address) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
    }


    private String getCustomerInf(){
        return
                "first Name: " + firstName +
                "second Name: " + secondName +
                "adress: " + address;
    }

    public void printCustomerInf(){
        System.out.println(getCustomerInf());
    }

}
