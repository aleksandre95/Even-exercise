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
public class CounterUser implements Runnable {
    Counter count;
    private final int Max = 10000;
    public CounterUser(Counter count) {
        this.count = count;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < Max; i++) {
            count.incrementV1();
            
        }
        
    }
    
}
