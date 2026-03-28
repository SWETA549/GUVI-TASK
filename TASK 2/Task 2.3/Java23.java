package task2;


class Account {
    double balance;

    
    Account() {
        balance = 0;
    }

    
    Account(double balance) {
        this.balance = balance;
    }

    
    void deposit(double amount) {
        balance += amount;
    }

    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class Java23 {
    public static void main(String[] args) {
        Account acc = new Account(1000);

        acc.deposit(500);
        acc.withdraw(300);
        acc.displayBalance();
    }
}