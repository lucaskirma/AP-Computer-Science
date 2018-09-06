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
public class FibonacciValue {
    public int value;
    public boolean bool;
    public String mark;
    public int position;
    
    public void evenCheck(){
        bool = value%2==0;
        if(bool){
            mark="*";
        }
        else{
            mark="";
        }
    }
    public void printFib(){
        System.out.println(position+": "+value+mark);
    }
}
