/**
*    File name: Faculty.java
*    Short description: Faculty class
*    IST 311 Assignment:  Objects Classes and Inheritances
*    @author Nick Hirsh
*    @version 1.01 2017-09-06
*    date of last revision: 2017-03-31
*    details of the revision: none
*/

public class Faculty extends Employee implements Changeable
{
    // instance variables
    private String officeID;
    private String officePhone;
    private String dateOfEmployment;
    private String rank;
    
    // no arg constructor
    Faculty()
    {
        super.setFirstName(null);
        super.setLastName(null);
        this.officeID = null;
        this.officePhone = null;
        this.dateOfEmployment = null;
        this.rank = null;      
    }
    
    // for the purpose of the exercise
    Faculty(String firstName, String lastName, String rank)
    {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.officeID = null;
        this.officePhone = null;
        this.dateOfEmployment = null;
        this.rank = rank;      
    }
    
    // override toString method
    @Override
    public String toString()
    {
        return "Faculty, " + super.getFirstName() + " " + super.getLastName() + ", " + rank;
    }

    // implementation of Changeable interface
    @Override
    public String changeName(String firstName, String lastName) 
    {
        super.setFirstName(firstName);
        super.setLastName(lastName);    
        return "Faculty name changed to " + firstName + " " + lastName;
    }
}
