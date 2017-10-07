/**
*    File name: Student.java
*    Short description: Student class
*    IST 311 Assignment:  Objects Classes and Inheritances
*    @author Nick Hirsh
*    @version 1.01 2017-09-06
*    date of last revision: 2017-03-31
*    details of the revision: none
*/

public class Student extends Person implements Changeable
{
    // classStatus constants
    private final String freshman = "Freshman";
    private final String sophomore = "Sophomore";
    private final String junior = "Junior";
    private final String senior = "Senior";
    
    // instance variables
    private String classStatus;
    
    // constructors
    Student()
    {
        super.setFirstName(null);
        super.setLastName(null);
        this.classStatus = null;
    }
    
    Student(String firstName, String lastName, String classStatus)
    {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        
        if (classStatus.equalsIgnoreCase(freshman))
        {
            this.classStatus = freshman;
        }
        else if (classStatus.equalsIgnoreCase(sophomore))
        {
            this.classStatus = sophomore;
        }
        else if (classStatus.equalsIgnoreCase(junior))
        {
            this.classStatus = junior;
        }
        else if (classStatus.equalsIgnoreCase(senior))
        {
            this.classStatus = senior;
        }
        else
        {
            this.classStatus = null;
        }
    }
    
    // toString method overriden
    @Override
    public String toString()
    {
        return "Student, " + super.getFirstName() + " " + super.getLastName() + ", " + classStatus;
    }
    
    // implementation of Changeable interface
    @Override
    public String changeName(String firstName, String lastName) 
    {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        return "Student name changed to " + firstName + " " + lastName;
    }
    
    
}
