public class Driver {
    public static void main(String [] args){

        I1 obj = ()-> System.out.println("Hello Lambda Function...");
        obj.show();
    }
}

@FunctionalInterface
interface  I1{
    void show();
}