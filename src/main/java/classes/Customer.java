package classes;

import java.util.Arrays;
import java.util.Comparator;

public class Customer {

    public Customer(String lastName, String firstName, String middleName, long cardNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.cardNumber = cardNumber;
    }

    int id;
    String lastName;
    String firstName;
    String middleName;
    String address;
    long cardNumber;
    long bankAccount;

    public void customersList(Customer[] list) {
        Arrays.stream(list).sorted(Comparator.comparing((Customer c) -> (c.lastName + c.firstName + c.middleName))).forEach(System.out::println);
    }

    public void customersListRestrictedByCardNumber(Customer[] list, long lower, long upper){
        Arrays.stream(list).filter(customer -> customer.cardNumber < upper && customer.cardNumber > lower).forEach(System.out::println);
    }

    public Customer() {
    }

    public Customer(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Customer(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
