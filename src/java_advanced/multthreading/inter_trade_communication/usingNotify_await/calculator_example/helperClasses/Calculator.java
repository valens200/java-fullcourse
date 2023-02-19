

/*

  @author valens NIYONSENGA || valensniyonsenga2003@gmail.com { Student At Rwanda Coding Academy }
  @inspired by Rwagaju aphrodice || aphrorwa@gmail.com { Programming instructor at Rwanda Coding Academy }
 * after learning how we can have a communication between threads in java by using locks and conditions to avoid deadlocks
 *
 * BY now we are going to see how we can achieve the same goal with notify , notifyAll and await methods provided by jvm
 *  */

package java_advanced.multthreading.inter_trade_communication.usingNotify_await.calculator_example.helperClasses;

public class Calculator {
    int number;
    boolean threadEntered = true;
    public Calculator(int number) {
        this.number = number;
    }
    public synchronized  void decrementNumber(){
        try{
            number = number - 1;
            System.out.println("current value : " + number);
        }catch (Exception exception){
            System.out.println("Error : " + exception.getMessage());
        }finally {
            threadEntered = false;
            notifyAll();
        }
    }
    public  synchronized    void incrementNumber(){
        try{
            if (threadEntered){
                wait();
            }
            number++;
            System.out.println("current value : " + number);
        }catch (Exception exception){
            System.out.println("Error : " + exception.getMessage());
        }finally {
            threadEntered = false;
            notifyAll();
        }
    }
    public    int getNumber(){
        return  number;
    }

}
