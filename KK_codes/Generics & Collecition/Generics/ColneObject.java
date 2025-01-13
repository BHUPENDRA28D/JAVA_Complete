package Generics;

public class ColneObject {





}

class Student implements Cloneable{
    private  int age;
    private String name;

    public Student(int age,String name){
        this.age= age;
        this.name =name;
    }

    public Student(Student other){
        this.age = other.age;
        this.name = other.name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}