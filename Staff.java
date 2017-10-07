/**
*    File name: Staff.java
*    Short description: Staff class
*    IST 311 Assignment:  Objects Classes and Inheritances
*    @author Nick Hirsh
*    @version 1.01 2017-09-06
*    date of last revision: 2017-03-31
*    details of the revision: none
*/

public class Staff extends Employee
{
    // instance variables
    private String officeID;
    private String officePhone;
    private String dateOfEmployment;
    private String title;
    
    // constructors
    Staff()
    {
        super.setFirstName(null);
        super.setLastName(null);
        this.officeID = null;
        this.officePhone = null;
        this.dateOfEmployment = null;
        this.title = null;      
    }
    
    Staff(String firstName, String lastName, String title)
    {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.officeID = null;
        this.officePhone = null;
        this.dateOfEmployment = null;
        this.title = title;      
    }
    
    // override toString method
    @Override
    public String toString()
    {
        return "Staff, " + super.getFirstName() + " " + super.getLastName() + ", " + title;
    }
}
