package ru.raiffeisen.learning;

public class App {
    public static void main(String[] args) {

        Customer cust1 = new Customer("MASHA", "IVANOVA", "GOROD");
        Account acc1 = new Account(1, 4, cust1);
        acc1.printinfo();
    }
}