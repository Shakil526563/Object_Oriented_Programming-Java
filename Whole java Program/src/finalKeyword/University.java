
package finalKeyword;


public class University {
    final String name = "Daffodil International University";
    final int semesterfee;
    static int semester;
    static{
        semester=12;
    }
      University(){
          semesterfee=300;
      }
    public void display(){
        System.out.println(name);
        System.out.println(semesterfee);
            System.out.println(semester);
            
            
    }
    
}
