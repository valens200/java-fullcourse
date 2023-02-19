/*
* @author valens NIYONSENGA || valensniyonsenga2003@gmail.com {Student at Rwanda Coding Academy
  @inspired by Rwagaju aphrodice || aphrorwa@gmail.com {Programming instructor at Rwanda Coding Academy}
*  */

package java_advanced.multthreading.inter_trade_communication.usingLocks_condition.calculator_example.threads;

import java_advanced.multthreading.inter_trade_communication.usingLocks_condition.calculator_example.helperclasses.Calculator;

public class IncrementThread implements  Runnable {
    Calculator calculator ;
    public IncrementThread(Calculator calculator){
        this.calculator = calculator;
    }
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            calculator.incrementNumber();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
