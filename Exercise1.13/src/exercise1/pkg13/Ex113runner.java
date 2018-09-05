/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.pkg13;

/**
 *
 * @author lukec
 */
public class Ex113runner {
    static final int MAX_INDEX = 9;
    public static void run(){
        int lo=1,hi=1,num=1;
        String mark;
        
        System.out.printf("1: %d%n", lo);
        for(int i=MAX_INDEX-1; i>0; i--){
            if(hi%2==0){
                mark= " *";
            }
            else{
                mark="";
            }
            num+=1;
            System.out.printf("%d: %d%s%n",num,hi,mark);
            hi=lo +hi;
            lo=hi-lo;
        }
    }
}
