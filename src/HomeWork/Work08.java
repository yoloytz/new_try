package HomeWork;

public class Work08 {
    public static void main(String[] args) {
        BankAccount ytzacc = new CheckingAccount();
        ytzacc.setBalance(3000);
        ytzacc.deposit(20);
        System.out.println(ytzacc.getBalance());
    }
}

class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public BankAccount() {
    }

    public void deposit(double amount){
        balance += amount;

    }

    public void withdraw(double amount){
        balance -= amount;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
