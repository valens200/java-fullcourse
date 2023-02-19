
/*
* @author valens NIYONSENGA || valensniyonsenga2003@gmail.com {Student at Rwanda Coding Academy
  @inspired by Rwagaju aphrodice || aphrorwa@gmail.com {Programming instructor at Rwanda Coding Academy}
*  */
package java_advanced.multthreading.inter_trade_communication.usingLocks_condition.calculator_example.helperclasses;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Calculator {
    int number;
    boolean valueSet = false;
    ReentrantLock lock;
    Condition condition;
    public Calculator(int number) {
        this.number = number;
        lock = new ReentrantLock();
        condition = lock.newCondition();
    }
    public    void decrementNumber(){
        lock.lock();
        try{
            number = number - 1;
            System.out.println("current value : " + number);
        }catch (Exception exception){
            System.out.println("Error : " + exception.getMessage());
        }finally {
            lock.unlock();
            valueSet = true;
        }
    }
    public    void incrementNumber(){
        lock.lock();
        try{
            number++;
            System.out.println("current value : " + number);
        }catch (Exception exception){
            System.out.println("Error : " + exception.getMessage());
        }finally {
            lock.unlock();
        }
    }
    public    int getNumber(){
        return  number;
    }

}
