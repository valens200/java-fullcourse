package multithreading.bank;

import multithreading.bank.helperClasses.BankAccount;
import multithreading.bank.helperClasses.DepositRunnable;
import multithreading.bank.helperClasses.WithdrawRunnable;

public class BankAccountThreadRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        final  double AMOUNT = 100;
        final int REPETITIONS = 100;
        final  int THREADS = 100;
        for(int i = 1; i < THREADS; i++){
            DepositRunnable d = new DepositRunnable(account, AMOUNT, REPETITIONS);
            WithdrawRunnable w = new WithdrawRunnable(account, AMOUNT, REPETITIONS);
            Thread thread1 = new Thread(d);
            Thread thread = new Thread(w);
            thread.start();
            thread1.start();
        }


    }
}
