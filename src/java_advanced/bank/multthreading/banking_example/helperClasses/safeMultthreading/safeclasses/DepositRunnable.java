package java_advanced.bank.multthreading.banking_example.helperClasses.safeMultthreading.safeclasses;


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
