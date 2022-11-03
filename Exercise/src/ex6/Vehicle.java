/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

/**
 *
 * @author DELL
 */
public class Vehicle implements Engine {

    private int a;

    @Override
    public void speed(int a) {

        System.out.println(a);
    }

    @Override
    public void showspeedmeter(int a) {
        System.out.println(a);
    }
    public static void main(String[] args) {
            Vehicle a=new Vehicle();
            a.speed(8);
            a.showspeedmeter(9);
    }
}

    

