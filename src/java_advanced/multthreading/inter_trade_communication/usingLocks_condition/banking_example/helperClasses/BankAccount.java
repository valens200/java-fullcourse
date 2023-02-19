package java_advanced.multthreading.inter_trade_communication.usingLocks_condition.banking_example.helperClasses;

public class BankAccount {
    private double balance;
    public  BankAccount(){
        balance = 0;
    }
    public  void deposit(double amount){
        System.out.println("Depositing :  " + amount + " FRW");
        balance = balance + amount;
        System.out.println("Now new balance is : " + balance + " FRW");
    }
    public  void withdraw(double income){
        System.out.println("Withdrawing  : " + income + " FRW");
        balance = balance - income;
        System.out.println("The current balance is " + balance + " RFW");
    }
    public double getBalance(){
        return balance;
    }
}
