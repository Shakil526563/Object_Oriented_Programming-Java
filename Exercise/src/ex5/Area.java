/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author DELL
 */
public class Area implements Shape {

  

    @Override
    public void area(int a, int b) {
       int Area= 0;
       Area=a*b;
       System.out.println("AREA :"+Area);
    }

    @Override
    public void trangle(int a, int b) {
        int Trangle=0;
        Trangle=(int) (0.5*(a*b));
        System.out.println("TRANGLE "+Trangle);
    }

    
}
