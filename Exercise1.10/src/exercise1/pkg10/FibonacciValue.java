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
    
    public void evenCheck(){
        if (value%2==0){
            bool=true;
        }
        else{
            bool=false;
        }
    }
}
