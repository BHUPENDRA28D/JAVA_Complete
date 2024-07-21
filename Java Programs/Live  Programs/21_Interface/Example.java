interface i1{
   
    void show();
}
class  i2 {
     
    public void display(){ System.out.println(
        "Hello this is inheritance..");}
    
}
class i3 extends i2 implements i1{
    public void show(){ System.out.println("Hello this is interface..");}
}
public class Example {
    public static void main(String[] args) {
        i3 i = new i3();
        i.show();
        i.display();
    }
}