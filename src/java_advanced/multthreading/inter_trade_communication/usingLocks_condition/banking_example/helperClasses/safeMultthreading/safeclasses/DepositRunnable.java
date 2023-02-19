/*
* @author valens NIYONSENGA || valensniyonsenga2003@gmail.com {Student at Rwanda Coding Academy
  @inspired by Rwagaju aphrodice || aphrorwa@gmail.com {Programming instructor at Rwanda Coding Academy}
*  */
package java_advanced.multthreading.inter_trade_communication.usingLocks_condition.banking_example.helperClasses.safeMultthreading.safeclasses;
public class DepositRunnable  implements  Runnable{
    private BankAccount  account;
    private double AMOUNT;
    private  int REPETITIONS;
    public  DepositRunnable(BankAccount account, double  AMOUNT, int  REPETITIONS){
        this.account =account;
        this.AMOUNT = AMOUNT;
        this.REPETITIONS = REPETITIONS;
    }
    @Override
    public void run() {
        int delay = 1000;
        int count = 4;
        try{
            for(int i = 0; i <= count ; i++){
                account.deposit(AMOUNT);
                Thread.sleep(delay);
            }

        }catch (Exception exception){

        }

    }
}
