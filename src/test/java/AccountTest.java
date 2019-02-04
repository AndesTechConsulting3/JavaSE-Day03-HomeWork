import org.junit.Test;

public class AccountTest {

    @Test
    public void testAccount() {

        Customer customer = new Customer();
        Account account = new Account(customer);
        customer.setFirstName("Иван");
        customer.setSecondName("Иванов");
        customer.setAdress("Москва, Андропова,18");

        System.out.println(customer.toString());
    }
}
