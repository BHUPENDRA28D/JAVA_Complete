import java.util.Scanner;
import p1.Account;
public class A16 {


    public void driver(){
        Employe e1 = new Employe();
        e1.input();
        e1.display();

    }}

    // Question 1


class Person {
    private int age;
    private String name ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Employe extends  Person{
    private double salary;

    protected double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name :");
        setName(sc.nextLine());
        System.out.println("Enter Age : ");
        setAge(sc.nextInt());
        System.out.println("Enter Salary : ");
        setSalary(sc.nextDouble());
    }

    public void display(){
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
        System.out.println("Salary : "+getSalary());
    }

}


class Customer{


    private Account account;
    private String custromerName;
    Customer(int acc,double initialBalance){
        account.setAccountNo(acc);
        account.setBalance(initialBalance);
    }
// depostie money
    public void deposite(double amount){
       account.setBalance(account.getBalance()+amount) ;
    }

    //withdraw money
    public void withdraw(double amount){
        if(account.getBalance()-amount>0){
       account.setBalance(account.getBalance()-amount);}else {
            System.out.println("Insufficent Balance");
        }
    }
    //checkBalance
    public void checkBalance(){
        System.out.print(account.getBalance());

    }

}
