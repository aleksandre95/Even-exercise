/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deletethreadsem3;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author user
 */
public class Counter {
    private int c =0;
    private AtomicInteger myInt = new AtomicInteger();
    
    public synchronized void increment(){
        int result = c;
        result++;
        c=result;
        
    }
    
    public int value(){
       return myInt.intValue();
    }
    public void incrementV1(){
       myInt.incrementAndGet();
    }
    
}
