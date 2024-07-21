

public class Example {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.setRollNo(100);
        // s1.setAge(23);
        // s1.setName("Virat Sharama");

        // System.out.println("Roll NO : "+s1.getRollNo()+
        // "\nName : "+s1.getName()+"\nAge : "+s1.getAge());

        SuperCar obj = new SuperCar();
        obj.f1(85);
        obj.f1(34,56);
        // OverRiding. 
        obj.car();
        SuperCar.func1();

}}
class Car{
    //OverLoading.
    public void f1(int x){
        System.out.println("This is f1 method of class Car");
    }
    public void car(){System.out.println("Class Car");}
    public static void  func1(){System.out.println("Static fuction");}
}
class SuperCar extends Car{
    //OverLoading.

    public void f1(int x, int y){
        System.out.println("This is f1 method of class SuperCar");
    }
    //OverRiding
    public void car(){System.out.println("Class SuperCar");}
    //function hiding and not overriding if it is static .
    public static void func1(){System.out.println("Static fuction");}

}