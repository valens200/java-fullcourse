package java_advanced.bank.multthreading.banking_example.helperClasses.safeMultthreading.safeclasses;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private Lock balanceChangeLock;
    private Condition suffientFundsCondition ;
    private double balance;
    public  BankAccount(){
        balance = 0;
        balanceChangeLock = new ReentrantLock();
        suffientFundsCondition = balanceChangeLock.newCondition();
    }
    public  void deposit(double amount){
        balanceChangeLock.lock();
        try{
            System.out.println("Depositing :  " + amount + " FRW");
            balance = balance + amount;
            System.out.println("Now new balance is : " + balance + " FRW");
            suffientFundsCondition.signalAll();
        }catch (Exception exception){
            System.out.println("Error : " + exception.getMessage());
        }finally {
            balanceChangeLock.unlock();
        }
    }
    public  void withdraw(double income){
        balanceChangeLock.lock();
        try{
            System.out.println("Withdrawing  : " + income + " FRW");
            balance = balance - income;
            System.out.println("The current balance is " + balance + " RFW");
            suffientFundsCondition.await();
        }catch (Exception exception){
            System.out.println("Error " + exception.getMessage());
        }finally {
            balanceChangeLock.unlock();
        }
    }
    public double getBalance(){
        return balance;
    }
}
