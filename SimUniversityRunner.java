
import java.util.ArrayList;

/**
*    File name: SimUniversityRunner.java
*    Short description: SimUniversityRunner class
*    IST 311 Assignment:  Objects Classes and Inheritances
*    @author Nick Hirsh
*    @version 1.01 2017-09-06
*    date of last revision: 2017-03-31
*    details of the revision: none
*/
public class SimUniversityRunner 
{
    public static void main(String[] args)
    {
        // creating three Person objects with unique names
        Person person1 = new Person("Nick", "Hirsh");
        Person person2 = new Person("John", "Smith");
        Person person3 = new Person("Chris", "Johnson");
        
        // creating three Employee objects with unique names
        Employee emp1 = new Employee("Daenerys", "Targaryen");
        Employee emp2 = new Employee("Jon", "Snow");
        Employee emp3 = new Employee("Tyrion", "Lannister");

        // creating three Student objects with unique names and status'
        Student stu1 = new Student("Arya", "Stark", "Freshman");
        Student stu2 = new Student("Sansa", "Stark", "Sophomore");
        Student stu3 = new Student("Margaery", "Tyrell", "Senior");
        
        // creating three Faculty objects with unique names and ranks
        Faculty fac1 = new Faculty("Khal","Drogo","Professor");
        Faculty fac2 = new Faculty("Petyr","Baelish","Associate Professor");
        Faculty fac3 = new Faculty("Ramsay","Bolton","Assistant");
                
        // creating three Staff objects with unique names and titles
        Staff staff1 = new Staff("Jaime","Lannister","Knight");
        Staff staff2 = new Staff("Bran","Stark","Visionary");
        Staff staff3 = new Staff("Gregor","Clegane","Enforcement");
        
        // creating the arraylist
        ArrayList<Object> arrayList = new ArrayList<>();
        
        // adding all objects to the list
        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);
        arrayList.add(emp1);
        arrayList.add(emp2);
        arrayList.add(emp3);
        arrayList.add(stu1);
        arrayList.add(stu2);
        arrayList.add(stu3);
        arrayList.add(fac1);
        arrayList.add(fac2);
        arrayList.add(fac3);
        arrayList.add(staff1);
        arrayList.add(staff2);
        arrayList.add(staff3);
        
        // loop to iterate through arrayList and call toString method
        for (int i=0; i<arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i).toString());
        }

        
    }
}

/* test run

run:
Person, Nick Hirsh
Person, John Smith
Person, Chris Johnson
Employee, Daenerys Targaryen
Employee, Jon Snow
Employee, Tyrion Lannister
Student, Arya Stark, Freshman
Student, Sansa Stark, Sophomore
Student, Margaery Tyrell, Senior
Faculty, Khal Drogo, Professor
Faculty, Petyr Baelish, Associate Professor
Faculty, Ramsay Bolton, Assistant
Staff, Jaime Lannister, Knight
Staff, Bran Stark, Visionary
Staff, Gregor Clegane, Enforcement
BUILD SUCCESSFUL (total time: 0 seconds)

*/
