package classes;

public class ClassTask {

    public static void main(String[] args) {

    Customer[] customers = {  new Customer("Ab", "Ab", "Ab", 1254L),
                         new Customer("Aa", "Aa", "Aa",125L),
                         new Customer("Dd", "Dd", "Dd",123456L),
                         new Customer("Bb", "Bb", "Bb",11111111L)};

        Customer customer = new Customer();
        System.out.println("Restricted By Cards");
        customer.customersListRestrictedByCardNumber(customers, 126L, 1234567L);
        System.out.println("Sorted By Name");
        customer.customersList(customers);

    }
}
