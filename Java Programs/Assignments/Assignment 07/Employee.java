class Person {
    int empId;
    String name;
    double salary;

    public void getProperties(){
        System.out.println(
            "Employee ID: " + this.empId + "\n" + 
            "Name: " + this.name + "\n" +  
            "Salary: $" +   this.salary +"\n"
        );

    }
    public void setProperties (int id , String name, double sal){
        empId =id;
        this.name=name;
        salary =sal;
    }
    
}
public class Employee extends Person{
    public static void main(String[] args)
    {
        //create object of the class Person
        Employee e1 = new Employee();
        //set properties for the Employee
        e1.setProperties(23456,"John Doe",7000);
        //display the property values of the Employee
        
        e1.getProperties();
    }
}