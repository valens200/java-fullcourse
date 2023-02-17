package multithreading.bank.helperClasses.safeMultthreading;


import multithreading.bank.helperClasses.safeMultthreading.safeclasses.BankAccount;
import multithreading.bank.helperClasses.safeMultthreading.safeclasses.DepositRunnable;
import multithreading.bank.helperClasses.safeMultthreading.safeclasses.WithdrawRunnable;

public class BankAccountSaveThreadRunner {
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
            thread1.start();
            thread.start();
        }

    }
}
