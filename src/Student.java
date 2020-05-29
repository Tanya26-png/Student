/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heert
 */
public class Student {
    
    private String name;
    private String numHours;

    /**
     * Get the value of numHours
     *
     * @return the value of numHours
     */
    public String getNumHours() {
        return numHours;
    }

    /**
     * Set the value of numHours
     *
     * @param numHours new value of numHours
     */
    public void setNumHours(String numHours) {
        this.numHours = numHours;
    }

   

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    
}
