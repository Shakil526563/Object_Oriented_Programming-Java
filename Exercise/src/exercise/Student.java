/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author DELL
 */
public class Student extends Person {
    private int id;
   private String dep;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
    
    public Student(String name, int age,int id,String dep) {
        super(name, age);
        this.id=id;
        this.dep=dep;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Id: "+id);
        System.out.println("Department: "+dep);
    }

    public Student(int id, String name, int age) {
        super(name, age);
        this.id = id;
        
    }
    
    
    
}
