/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg12;
public class Ex112runner {
    static final int MAX_INDEX=9;
    static final int MAX=100;
    public static final String title="The Fibonacci Sequence (Up to The Set Max Value):";
    public static void run(){
        int lo=1,hi=1;
        String mark;
        String[] seqMark= new String[MAX];
        int[] seqFib= new int[MAX];
        System.out.println(title);
        System.out.println("1: "+lo);
        for(int i=2; i<=MAX_INDEX; i++){
            if(hi%2==0){
                mark="*";
            }
            else{
                mark = "";
            }
            seqMark[i]=mark;
            seqFib[i]=hi;
            hi=lo+hi;
            lo=hi-lo;        
        }
        for(int j=2; j<MAX_INDEX;j++){
            System.out.println(j+": "+seqFib[j]+seqMark[j]);
        }
    }
}
