package java_advanced.multthreading.inter_trade_communication.usingLocks_condition.banking_example.helperClasses.safeMultthreading;


import java_advanced.multthreading.inter_trade_communication.usingLocks_condition.banking_example.helperClasses.safeMultthreading.safeclasses.BankAccount;
import java_advanced.multthreading.inter_trade_communication.usingLocks_condition.banking_example.helperClasses.safeMultthreading.safeclasses.DepositRunnable;
import java_advanced.multthreading.inter_trade_communication.usingLocks_condition.banking_example.helperClasses.safeMultthreading.safeclasses.WithdrawRunnable;

public class BankAccountSaveThreadRunner {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();
        final  double AMOUNT = 100;
        final int REPETITIONS = 100;
        final  int THREADS = 100;
        for(int i = 1; i < THREADS; i++){
            DepositRunnable d = new DepositRunnable(account, AMOUNT, REPETITIONS);
            WithdrawRunnable w = new WithdrawRunnable(account, AMOUNT, REPETITIONS);
            Thread thread1 = new Thread(d);
            Thread thread = new Thread(w);


            //is ALive method helps ypu to check whether a thread is alive or not.
            System.out.println(thread.isAlive());
            thread1.start();
            thread.start();
        }

    }
}
