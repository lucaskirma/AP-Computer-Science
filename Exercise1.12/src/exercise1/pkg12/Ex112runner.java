/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg12;
public class Ex112runner {
    static final int MAX=50;
    public static final String title="The Fibonacci Sequence (Up to The Set Max Value):";
    public static void run(){
        int lo=1,hi=1, i=0;
        String[] seq= new String[MAX];
        System.out.println(title);
        System.out.println(lo);
        while(hi<MAX){
            seq[i]=Integer.toString(hi);
            i++;
            hi=lo+hi;
            lo=hi-lo;        
        }
        for(int j=0; j<i;j++){
            System.out.println(seq[j]);
        }
    }
}
