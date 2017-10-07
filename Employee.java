/**
*    File name: Employee.java
*    Short description: Employee class
*    IST 311 Assignment:  Objects Classes and Inheritances
*    @author Nick Hirsh
*    @version 1.01 2017-09-06
*    date of last revision: 2017-03-31
*    details of the revision: none
*/

public class Employee extends Person
{
    // constructors
    Employee()
    {
        super.setFirstName(null);
        super.setLastName(null);
    }
    
    Employee(String firstName, String lastName)
    {
        super.setFirstName(firstName);
        super.setLastName(lastName);
    }
    
    // override toString method
    @Override
    public String toString()
    {
        return "Employee, " + super.getFirstName() + " " + super.getLastName();
    }
}
