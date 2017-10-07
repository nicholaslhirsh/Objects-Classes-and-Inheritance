/**
*    File name: Person.java
*    Short description: Person class
*    IST 311 Assignment:  Objects Classes and Inheritances
*    @author Nick Hirsh
*    @version 1.01 2017-09-06
*    date of last revision: 2017-03-31
*    details of the revision: none
*/

public class Person 
{
    // instance variables
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    
    // constructors
    Person()
    {
        this.firstName = null;
        this.lastName = null;
        this.phoneNumber = null;
        this.emailAddress = null;            
    }
    
    // constructors
    Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = null;
        this.emailAddress = null;            
    }
    
    Person(String firstName, String lastName, String phoneNumber, String emailAddress)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;            
    }

    // getters and setters
    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() 
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) 
    {
        this.emailAddress = emailAddress;
    }
    
    // override toString method
    @Override
    public String toString()
    {
        return "Person, " + firstName + " " + lastName;
    }
        
}
