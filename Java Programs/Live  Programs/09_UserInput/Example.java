import java.util.Scanner;
class Example{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name : ");
        String name = sc.nextLine();
        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        System.out.println("Name : "+name+"\n"+"Age : "+age+"\n");
    }
}