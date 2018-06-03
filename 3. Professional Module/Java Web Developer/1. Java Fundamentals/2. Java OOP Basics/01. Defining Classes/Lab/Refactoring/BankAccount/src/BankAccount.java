public class BankAccount {
    private int id;
    private double balance;

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
        return String.format("Account ID%d, balance %.2f", this.getId(), this.getBalance());
    }
}
