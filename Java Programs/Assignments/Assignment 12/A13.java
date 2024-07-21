import java.awt.*;
import java.util.Scanner;

public class A13 {
    public void driver(){

//        reverseNo();
  factorial();
    }
    public void evenOdd(){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x / 2 * 2 == x)
            System.out.println(x + " is Even");
        else  System.out.println(x + " is Odd");

    }
    public  void greatestNO(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int greatest;
       if(x>=z && x>y)
           greatest =x;
       else if (y>=x && y>=z)
           greatest =y;

       else
           greatest =z;

       System.out.println(+greatest+" is the Greatest No");
    }

    public  void countDigitNO(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int temp =x;
        int count=0;
        while(temp !=0){
            count++;
            temp = temp/10;
        }
    }

    public  void reverseNo(){
        Scanner sc =new Scanner(System.in);
        int x =sc.nextInt();
        int rem ;
        int rev =0;
        while(x!=0){
            rem = x%10;
            rev =rev *10 +rem;
            x =x/10;
        }

        System.out.println("Reversed No :: "+rev);

    }

    private void sumNaturalNo(){
        System.out.print("Enter the No : ");
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int sum =0;
        for(int i =1;i<=x;i++)
            sum+=i;

        System.out.print("Sum  : "+sum);

    }
    private void sumOddNo(){
        System.out.print("Enter the No : ");
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int sum =0;
        for(int i =0;i<=x;i++)
            sum+= 2*i+1;


        System.out.print("Sum  of Odd : "+sum);

    }

    private void sumEveno(){
        System.out.print("Enter the No : ");
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int sum =0;
        for(int i =0;i<=x;i++)
            sum+= 2*i;


        System.out.print("Sum  of Even : "+sum);

    }
    private void sumSquare(){
        System.out.print("Enter the No : ");
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int sum =0;
        for(int i =0;i<=x;i++)
            sum+= i*i;


        System.out.print("Sum  of Square : "+sum);

    }
    private void sumCubeNo(){
        System.out.print("Enter the No : ");
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int sum =0;
        for(int i =0;i<=x;i++)
            sum+= i*i*i;


        System.out.print("Sum  of Cube : "+sum);

    }    private void sumOFDigits(){
        System.out.print("Enter the No : ");
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int sum =0,temp,rem;
      temp =x;
        while(temp!=0){
            rem =temp%10;
            sum+=rem;
            temp =temp/10;
        }
        System.out.println(+x+" digits sum : "+sum);


        System.out.print("Sum  of Cube : "+sum);

    }




        public static void factorial() {
            System.out.print("Enter the number to take factorial of: ");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            long fact = 1;
            while (x != 0) {
                fact = fact * x;
                x--;
            }
            System.out.println("Factorial: " + fact);

            sc.close(); // Close the Scanner object
        }
    }



