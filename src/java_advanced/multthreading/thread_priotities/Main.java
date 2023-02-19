/*
* @author valens NIYONSENGA || valensniyonsenga2003@gmail.com {Student at Rwanda Coding Academy
  @inspired by Rwagaju aphrodice || aphrorwa@gmail.com {Programming instructor at Rwanda Coding Academy}
*  */





  /*
    Thread priorities

    a thread priority is a chance a thread is given by CPU to be allowed to execute. priorities range from 0 10 integer numbers
   */

package java_advanced.multthreading.thread_priotities;
public class Main {
    public static void main(String[] args) throws InterruptedException {
  /*
          defining threads
        you can define all the thread using lambda expressions a part from defining separate class
   */
        Thread helloThread = new Thread(() -> {
            System.out.println("calling hello thread");
        });
        Thread hiThread = new Thread(() -> {
            System.out.println("calling high Thread");
        });

        helloThread.setName("hello thread");
        hiThread.setName("hi thread");

        //setting priorities to all of above threads
        hiThread.setPriority(4);
        helloThread.setPriority(10);
        //by using priorities classes
        /*
        hiThread.setPriority(Thread.MIN_PRIORITY);
        helloThread.setPriority(Thread.MIN_PRIORITY);
        * */
        hiThread.start();
        helloThread.start();
         /*
          join method on every thread will pause the main thread until all created threads are complete
   */
        hiThread.join();
        helloThread.join();
        System.out.println("\t\t\t after calling all the threads!");
    }
}
