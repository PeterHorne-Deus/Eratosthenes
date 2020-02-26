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
        ArrayList<Integer> multiples = new ArrayList();
        
        int num = 2;
        int test;
        boolean yes = true;
        
        for(int k = 0; k <= 1000; k++){
            prime.add(k);
        }
        do{
            System.out.println(num);
            for(int i = 0; i < 500; i++){
                multiples.add(num*(num + i));
                if(multiples.get(i) > 1000){
                    break;
                }
            }

            for(int u = 0; u < multiples.size(); u++){
                boolean remove = prime.remove(multiples.get(u));

            }

            do{
                num++;
                if(yes != prime.contains(num)){
                    
                    multiples.clear();
                    yes = true;
                    
                }
                else{
                    yes = false;
                }
            }while(yes == false);
            yes = false;
            
        }while (num < 500);
        System.out.println(prime);
    }
        
        
    
    
}
