/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author aksha
 */
public class Student {

    /**
     * @param args the command line arguments
     */
   private String name;
   public Student(String givenName)
   {
   name=givenName;
   }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        this.name = givenName;
    }
   
    
}
