public class Example{
    public static void main(String[] args) {
        B obj = new B();
    }
}
 class A{
    int a;
    //default constructor
     public A(){ System.out.println("A Class Default Constructor..");}
     public A(int x ){
         this();
        this.a = x;
         System.out.println("A Class Perimeterized  Constructor..");
     }
 }



class B extends A{
    //default constructor
    int x ;
    public B (){
        this(12,33);
        System.out.println("B class Default  Consructor..");
    }
    public B(int x,int y){
        super(y);
        x = this.x;
        System.out.println("B Class Perimeterized Constructor..");
    }

}

