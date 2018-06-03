import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<BankAccount> accounts;

    public Person(String name, int age) {
        this(name, age, new ArrayList<>());
    }

    public Person(String name, int age , List<BankAccount> accounts) {
        this.setName(name);
        this.setAge(age);
        this.setAccounts(accounts);
    }

    private void setName(String inputName) {
        this.name = inputName;
    }

    private void setAge(int inputAge) {
        this.age = inputAge;
    }

    private void setAccounts(List<BankAccount> inputAccs) {
        this.accounts = inputAccs;
    }

    public double getBalance() {
        return this.accounts.stream().mapToDouble(x -> x.getBalance()).sum();
    }
}