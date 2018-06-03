public class BankAccount {
    private static final double DEFAULT_INTEREST = 0.02;

    private int id;
    private double balance;
    private static int bankAccountCount;
    private static double rate = DEFAULT_INTEREST;

    public BankAccount() {
        this.setId(++bankAccountCount);
    }

    public void setId(int inputId) {
        this.id = inputId;
    }

    public int getId() {
        return this.id;
    }

    public void setBalance(double inputBalance) {
        this.balance = inputBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setInterestRate(double inputInterest) {
        rate = inputInterest;
    }

    public double getInterest(int inputYears) {
        return this.balance * rate * inputYears;
    }

    public void deposit(double amount) {
        if(!(amount < 0)) {
            double oldBalance = this.getBalance();
            this.setBalance(oldBalance + amount);
        }
    }

    public void withdraw(double amount) {
        if(amount > this.getBalance()) {
            throw new IllegalStateException("Insufficient balance");
        } else {
            double oldBalance = this.getBalance();
            this.setBalance(oldBalance - amount);
        }
    }

    @Override
    public String toString() {
        return "ID" + this.getId();
    }
}