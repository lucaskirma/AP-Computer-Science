/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg10;

/**
 *
 * @author lukec
 */
public class Ex110runner {
    static final int MAX=50;
    public static final String title="The Fibonacci Sequence (Up to The Set Max Value):";
    public static void run(){
        int lo=1,hi=1,i=0;
        int j;
        FibonacciValue[] seq= new FibonacciValue[MAX];
        System.out.println(title);
        System.out.println(lo);
        while(hi<MAX){
            seq[i].value=hi;
            seq[i].evenCheck();
            i+=1;
            hi=lo+hi;
            lo=hi-lo; 
    }
        for(j=0; j<i;j++){
            System.out.println(seq[j].value);
        }
    } 
}
