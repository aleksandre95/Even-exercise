/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deletethreadsem3;

/**
 *
 * @author user
 */
public class DeleteThreadSem3 extends Thread {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) throws InterruptedException {
//        MyThread3 news = new MyThread3();
        Thread t1 = new MyThread();
        Thread t2 = new MyThread2();
        Thread t3 = new MyThread3();
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(10000);    
        t1.join();
        t2.join();
        t3.join();      
        
         
         t3.interrupt();
        
        
//        Thread t1 = new Thread(new CounterUser(count));
//        Thread t2 = new Thread(new CounterUser(count));
//        Thread t3 = new Thread(new CounterUser(count));
//        t1.start();
//        t2.start();
//        t3.start();
//        
//        t1.join();
//        t2.join();
//        t3.join();
//        
//        System.out.println(count.value());
        
    }
    
}
