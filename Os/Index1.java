
import java.util.Scanner;

public class Index1 extends Thread {

   void core1() {
      System.out.println("Inside core 1");

   }

   void core2() {
      System.out.println("Inside core2");
   }

   public static void main(String[] args) {

      Index1 inx = new Index1();
      // Thread thread = new Thread();
      int a;
      System.out.println("Enter the core to which you want to run the thread");
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();

      switch (a) {
         case 1:
            inx.core1();
            Thread t1 = new Thread() {
               public void run() {
                  System.out.println("Thread t1 is running");
               }
            };
            Thread t2 = new Thread() {
               public void run() {
                  System.out.println("Thread t2 is running");
               }
            };
            t1.start();
            t2.start();

            break;
         case 2:
            inx.core2();
            Thread t3 = new Thread() {
               public void run() {
                  System.out.println("Thread t3 is running");
               }
            };
            Thread t4 = new Thread() {
               public void run() {
                  System.out.println("Thread t4 is running");
               }
            };
            t3.start();
            t4.start();
            break;
         default: {
            System.out.println("Invalid value");
         }
      }

   }
}
