package HomeWork;

public class SavingAccount extends BankAccount{
    private int count =3;
    private double rate = 0.1;

    public void earnMonthlyInterner(){
        count = 3;
        super.deposit(getBalance() * rate);
    }
    @Override
    public void deposit(double amount) {
        if (count > 0){
        super.deposit(amount);
        count--;
        }else {
            super.deposit(amount - 1);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
            count--;
        }else {
            super.withdraw(amount + 1);
        }
    }


}
