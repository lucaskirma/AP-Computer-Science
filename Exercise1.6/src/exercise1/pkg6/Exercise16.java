/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg6;

/**
 *
 * @author lukec
 */
public class Exercise16 {
    static final int MAX=50;
    public static final String title="The Fibonacci Sequence (Up to The Set Max Value):";
    public static void main(String[] args) {
        int lo=1,hi=1;
        System.out.println(title);
        System.out.println(lo);
        while(hi<MAX){
            System.out.println(hi);
            hi=lo+hi;
            lo=hi-lo;        
    }
    
}
}
