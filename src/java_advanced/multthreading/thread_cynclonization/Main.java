package java_advanced.multthreading.thread_cynclonization;


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
