/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogit;

/**
 *
 * @author estuardo
 */
public class Decifrador1 {

    
   public static int suma(int pin){
        if(pin==0){
            return 1;
        }else{
            return pin%10*(suma((pin-(pin%10))/10));
        }
    }
    
    
}
