package world;
import java.io.*;


class Chicken{
    private int eggNo;
    private boolean eggSetFlag = false;
    public synchronized void setEggNO(int i ){
        while (eggSetFlag){
            try{wait();}catch (Exception e){}
        }
        eggNo =i;
        eggSetFlag = true;
        System.out.println("Set egg no = "+eggNo);
        notify();
    }

    public synchronized int getEggNo() {
        while(!eggSetFlag ){
            try{wait();}catch (Exception e){}
        }

        System.out.println("Get egg no "+eggNo);
        eggSetFlag =false;
        notify();
        return eggNo;
    }
}
class Producer implements Runnable{
    Chicken chick;
    public Producer(Chicken chick){this.chick =chick;}

    public  void run(){
        int i=1;
        while (true){
            chick.setEggNO(i++);
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}
class Consumer implements  Runnable{
    Chicken chick;
    public Consumer(Chicken chick){this.chick =chick;}
    public void run(){
        int i=1;
        while (true){
            chick.getEggNo();
            try{Thread.sleep(1000);}catch (Exception e){}
        }

    }
}

public class Example{
    public static void main(String [] args){
       System.out.println("Bhupendra :  "+ Thread.currentThread().getName()); // ye currentThreadfunction JVM ke run function se call hua he janha ( public void run()
        //{main();} ) ase call ho rha hoga..

//        ThreadingConcept.testDriver1();
//        ThreadingConcept.testDriver2();
//        ThreadingConcept.testDriver3();
//        ThreadingConcept.testDriver4();

//        FileExample fileExample = new FileExample();
//        try {
//            fileExample.f1();
//        }catch (IOException e){
//            System.out.println("Error : "+ e.getMessage());
//        }

        // Swing Application
        AdditionFrame frame = new AdditionFrame();

    }
}
 class ThreadingConcept {
     public static void testDriver1(){ // Implemention by Implementing Runnable class .
         A obj1 = new A();
         B obj2 = new B();
         Thread t1 = new Thread(obj1);
         Thread t2 = new Thread(obj2);
         t1.start();
         t2.start();


//         Thread t3 = new Thread(new Even());
//         Thread t4 = new Thread(new Odd());
//         t3.start();
//         t4.start();

     }

     public static void testDriver2(){
         C  obj1 = new C();
         D obj2 = new D();
         obj1.start();
         obj2.start();

     }
     public static void testDriver4(){
         Chicken chick = new Chicken();
         Producer p = new Producer(chick);

         Consumer c = new Consumer(chick);

         Thread t1 = new Thread(p," Producer Thread");
         Thread t2 = new Thread(c," Consumer Thread");
         t1.start();
         t2.start();
     }
     public static void testDriver3(){
         Thread t1 = new Thread(new Runnable() {
             @Override
             public void run() {
                 for(int i =1;i<=10;i++){

//                     try{Thread.sleep(2000);} catch (Exception e){
//                         System.out.println(e.getMessage());
//                     }


                     System.out.println("i = "+i+Thread.currentThread().getName());
                 }
             }
         },"MyThread");
         //Anonymus Class ..
         Thread t2= new Thread(new Runnable() {
             @Override
             public void run() {
                 for(int i =10;i<=20;i++){
                     System.out.println("j = "+i+Thread.currentThread().getName());
                 }
             }
         },"Your Thread");
         t1.start(); // Start the first thread
         t2.start();

     }
}

class C extends Thread{
    public void run(){
        f1();
    }
    public void f1(){
        int b =10;
        while(b != 1){
            System.out.println("b= "+b);
            b--;
        }

    }
}

class D extends Thread{
    public void run(){

        f2();
    }
    public void f2(){
        int a =10;
       while(a != 1){
           System.out.println("a = "+a);
           a--;
        }
    }
}
class A implements Runnable{
    //run function ko override karo
    public void run(){
        fi();
    }
    public void fi(){
      for(int i =1;i<=10;i++){
          System.out.println("i = "+i);}

    }
}
//class b
class B implements Runnable{
    public  void run(){
        f2();
    }
    public  void f2(){
        for(int j =10;j<=20;j++){
            System.out.println("j = "+j);}

    }
}

class Even implements Runnable {
    public void run() {
        even();
    }

    public void even() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is Even");
        }
    }
}
 class Odd implements  Runnable {
     public void run() {
         odd();
     }

     public void odd() {
         for (int i = 1; i <= 20; i++) {
             if (i % 2 != 0)
                 System.out.println(i + "is Odd");
         }
     }

   }

