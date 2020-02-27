/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eratosthenes;

import java.util.ArrayList;
/**
 *
 * @author pehor9164
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> prime = new ArrayList();
        ArrayList<Integer> num = new ArrayList();

        int test = 0;
        int u = 2;
       
        
        
        for(int k = 0; k <= 1000; k++){
            prime.add(k);
            num.add(k);
        }
        
        do{
            
            for(int i = 0; i < 500; i++){
                test = num.get(u) * (num.get(u) + i);
                
                
                if(prime.contains(test)){
                    prime.remove(prime.indexOf(test));
                    num.remove(num.indexOf(test));
                }
                if(test > 1000){
                   break;
                }
                
            }
            u++;
        }while (num.get(u) < 500);
        System.out.println(prime);
    }
        
        
    
    
}
