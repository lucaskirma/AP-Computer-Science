/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg4;

/**
 *
 * @author lukec
 */
public class Exercise14 {
        static final int MAX=100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base=1,square;
        while(base<MAX){
            square=base*base;    
            System.out.println(base+" squared is:"+square);
            base+=1;
        }
    }
    
}
