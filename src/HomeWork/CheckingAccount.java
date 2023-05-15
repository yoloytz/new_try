package HomeWork;

/**
   每次存款和取款都要收取1的手续费
 */
public class CheckingAccount extends BankAccount {

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
