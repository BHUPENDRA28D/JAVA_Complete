abstract class Person{
    private  String name;
    private  int age;
    public void setAge(int age){this.age =age;}
    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    public int getAge(){return age;}
//abstract Methode.
    abstract  void display();
}

//Base Class
class Student extends Person{
    private  int rollNo;
    public void setRollNo(int rollNo){this.rollNo = rollNo;}
    //abstract Methode.
    public void display(){System.out.println("Name: "+getName()+"\nAge: "+getAge()+"\nRollNo: "+rollNo);}
}


public class Example{
    public static void main(String[] args) {
// So here Person is an abstract class and it can not be initilized aperntly..
        // Person p1 = new Person();
        // p1.setAge(34);
        // p1.setName("John");
        // p1.display();

    Student s1 = new Student();
    s1.setAge(21);
    s1.setName("John Cina");
    s1.setRollNo(2421);
    s1.display();
    }


}