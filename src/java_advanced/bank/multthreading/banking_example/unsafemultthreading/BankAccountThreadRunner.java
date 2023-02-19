package java_advanced.bank.multthreading.banking_example.unsafemultthreading;

import java_advanced.bank.multthreading.banking_example.helperClasses.BankAccount;
import java_advanced.bank.multthreading.banking_example.helperClasses.DepositRunnable;
import java_advanced.bank.multthreading.banking_example.helperClasses.WithdrawRunnable;

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
            thread.start();
        }

    }
}
