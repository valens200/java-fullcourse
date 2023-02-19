/*
* @author valens NIYONSENGA || valensniyonsenga2003@gmail.com {Student at Rwanda Coding Academy
  @inspired by Rwagaju aphrodice || aphrorwa@gmail.com {Programming instructor at Rwanda Coding Academy}
*  */

package java_advanced.multthreading.inter_trade_communication.usingLocks_condition.banking_example.unsafemultthreading.helperClasses;
public class WithdrawRunnable  implements  Runnable{
    private BankAccount account;
    private  double amount;
    private  int repetitions;
    public  WithdrawRunnable(BankAccount account, double amount, int repetitions){
        this.account = account;
        this.amount = amount;
        this.repetitions = repetitions;
    }

    @Override
    public void run() {
        int delay = 1000;
        int count = 4;
        try{
            for(int i = 0; i <= count ; i++){
                account.withdraw(amount);
                Thread.sleep(delay);
            }

        }catch (Exception exception){

        }

    }
}
