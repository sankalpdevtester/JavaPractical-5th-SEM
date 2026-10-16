class BankAccount {
    private String holder;
    private String accountNumber;
    private double balance;

    BankAccount(String holder, String accountNumber, double balance) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    String getHolder() {
        return holder;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid deposit");
        } else {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount("X", "12345", 5000);

        b.deposit(1000);
        b.deposit(-200);
        b.withdraw(500);
        b.withdraw(0);
        b.withdraw(10000);

        System.out.println(b.getHolder());
        System.out.println(b.getAccountNumber());
        System.out.println(b.getBalance());
    }
}
