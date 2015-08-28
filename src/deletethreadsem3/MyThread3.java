/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deletethreadsem3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class MyThread3 extends Thread {


    
    public void run() {
        
        for (int i = 10; i<14; i++) {
             boolean tr = true;
                if(tr){
            
                System.out.println(i);
                }

                try {
                    Thread.sleep(3000);
                    
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            

        }
        
    }

}
