/*
 * Peter Horne-Deus
 * The program generates all prime numbers up to 1000
 * Resistors.java
 * March 2, 2020
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
        //Array lists
        ArrayList<Integer> prime = new ArrayList();
        ArrayList<Integer> num = new ArrayList();
        //Variables
        int test = 0;
        int u = 2;

        //Setting the array lists to have numbers from 0 - 1000
        for(int k = 0; k <= 1000; k++){
            prime.add(k);
            num.add(k);
        }
        
        do{
            //This loop contains the check for prime numbers
            for(int i = 0; i < 500; i++){
                //Begins by taking numbers that have never been tested or have 
                //no previous facotors and multiplies them by themselves plus 
                //one to find any numbers that have the tested numbers as factors from 0 -1000
                test = num.get(u) * (num.get(u) + i);
                
                //If the tested value exists then its not prime and is then removed
                if(prime.contains(test)){
                    prime.remove(prime.indexOf(test));
                    num.remove(num.indexOf(test));
                }
                //Ensuring only numbers within requested range are tested
                if(test > 1000){
                   break;
                }
                
            }
            u++;
        }while (num.get(u) < 500);
        
        //removing zero as its not a prime number
        prime.remove(0);
        //Final output
        System.out.println(prime);
    }
        
        
    
    
}
