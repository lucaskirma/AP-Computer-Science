/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg3;

/**
 *
 * @author lukec
 */
public class Exercise13 {
            static final int MAX=50;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lo=1,hi=1;
        System.out.println("The Fibonacci Sequence (Up to The Set Max Value):");
        System.out.println(lo);
        while(hi<MAX){
            System.out.println(hi);
            hi=lo+hi;
            lo=hi-lo;        
        }
    }
}
