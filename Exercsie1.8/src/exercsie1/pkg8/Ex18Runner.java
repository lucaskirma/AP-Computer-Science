/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercsie1.pkg8;

/**
 *
 * @author lukec
 */
public class Ex18Runner {
    
    public void run(){
        Point lowerLeft= new Point();
        Point upperRight = new Point();
        Point middlePoint = new Point();
        lowerLeft.x=0.0;
        lowerLeft.y=0.0;
        upperRight.x=1280.0;
        upperRight.y=1024.0;
        middlePoint.x=640.0;
        middlePoint.y=512.0;
        upperRight.copy(lowerLeft);
        System.out.println(upperRight.x+","+upperRight.y);
        lowerLeft.z=7;
        upperRight.z=9;
        System.out.println(lowerLeft.z);
                
    }
    
}
