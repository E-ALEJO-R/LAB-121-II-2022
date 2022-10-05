package patterns.creational.builder;

public class Account {
    private long number;
    private double balance;
    private String owner;

    private Account(long number) {
        this.number = number;
    }

    public void show() {
        System.out.println(number);
        System.out.println(balance);
        System.out.println(owner);
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public static class Builder {
        private final Account account;

        public Builder(long number) {
            this.account = new Account(number);
        }

        public Builder withBalance(double balance) {
            this.account.balance = balance;
            return this;
        }

        public Builder withOwner(String owner) {
            this.account.owner = owner;
            return this;
        }

        public Account build() {
            return account;
        }
    }
}
