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
public class MyThread extends Thread {
    public void run(){
        long pepi = 0;
        
        for (long i = 0; i < 1000000000; i++) {
            
            pepi+=i;
            
        }
        
        System.out.println(pepi);
    }
    
}
