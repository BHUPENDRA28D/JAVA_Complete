package Generics;

public class MultiThreading {

    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2= new Thread(new B());
        t1.start();
        t2.start();
    }

}
class A implements  Runnable{
    public void run(){
        f1();
    }
    public void f1(){
        for(int i =0;i<5;i++){
            System.out.println("Thread 1 "+i);
        }
    }
}

class B implements Runnable{
    public void run(){
        f1();
    }
    public void f1(){
        for(int i =0;i<5;i++){
            System.out.println("Thread 2 "+i);
        }
    }
}
