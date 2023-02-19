
/*
* @author valens NIYONSENGA || valensniyonsenga2003@gmail.com {Student at Rwanda Coding Academy
  @inspired by Rwagaju aphrodice || aphrorwa@gmail.com {Programming instructor at Rwanda Coding Academy}
*  */
package java_advanced.multthreading.inter_trade_communication.usingLocks_condition.calculator_example;
import java_advanced.multthreading.inter_trade_communication.usingLocks_condition.calculator_example.helperclasses.Calculator;
import java_advanced.multthreading.inter_trade_communication.usingLocks_condition.calculator_example.threads.DecrementThread;
import java_advanced.multthreading.inter_trade_communication.usingLocks_condition.calculator_example.threads.GetThread;
import java_advanced.multthreading.inter_trade_communication.usingLocks_condition.calculator_example.threads.IncrementThread;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(4);

        Thread incrementThread = new Thread(new IncrementThread(calculator), "incrementThread");
        Thread decrementThread = new Thread(new DecrementThread(calculator), "decrementThread");
        Thread getThread = new Thread(new GetThread(calculator), "getThread");

        incrementThread.setPriority(Thread.MAX_PRIORITY);
        decrementThread.setPriority(Thread.MIN_PRIORITY);
        getThread.setPriority(Thread.NORM_PRIORITY);

        incrementThread.start();
        decrementThread.start();

    }
}
