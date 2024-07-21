package A16;

import java.util.Scanner;

public class Person {
    private String name;
    private  int age;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }
}

class  Employee extends  Person{
    private  double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age: ");
        setAge(sc.nextInt());
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter the Name: ");
        setName(sc.nextLine());
        System.out.print("Enter the Salary: ");
        setSalary(sc.nextDouble());
    }

    public void display(){
        System.out.print("Name : "+getName()+"\nAge : "+getAge()+"\nSalary : "+getSalary());
    }
}