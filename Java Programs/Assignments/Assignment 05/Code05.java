class Code05{
 
  //Question 1. 
   void print5Time(){
     int i =5;
     while( i >0){
      System.out.println("MySirg");
      i--;}
   }
// Question 2.Write a program to print the first 10 natural numbers.
  void  printFirstTenNaturalNumbers() {
  System.out.println("10  Number.");
    for(int i=1; i<=10; i++){
        System.out.print(i + "  ");
    }
  }
//Question 3.Write a program to print the first 10 natural numbers in reverse order.
   void reverseOrder(){
    System.out.println("10  Number in Reverse.");
    for(int i =10; i> 0;i--)
      System.out.print("  "+i);
   }

//Question 4. Write a program that prints ten odd natural numbers.
  void  printOddNumber(){
     int i =1 ;
     System.out.println("10 Odd Number.");
     while(i<=10){
        System.out.print(" "+(2*i-1));
        i++;
     }

  }
//  Question 5.Write a program to print the first 10 odd natural numbers in reverse order.
  void  printReverseOddNumber(){
     int i = 10;
     System.out.println("10 Odd Number in Reverse.");
     while(i> 0){
        System.out.print(" "+ (2*i -1));
        i--;
     }
  }
  //Question 6. Write a program that prints ten even natural numbers.
  void  printEvenNumber(){
     int i =1 ;
     System.out.println("10 Even Number.");
     while(i<=10){
        
        System.out.print(" "+2*i);
        i++;
     }

  }
  //Question 7. Write a program that prints ten even natural numbers.
  void  printEvenReverse(){
     int i =1 ;
     System.out.println("10 Even Number in Reverse.");
     while(i>0){
        
        System.out.print(" "+2*i);
        i--;
     }

  }
  //Question 8. Write a program of Squre of first 10 natural no.
   void sq(){
    System.out.println("Sq of First 10 no. are: ");
    for(int i =1;i<=10;i++){
        System.out.print("  "+ i*i);
    }
   }
  //Question 9. Write a program of cube of first 10 natural no.
   void cube(){ 
      System.out.println("Cube  of First 10 no. are: ");
     for(int i =1;i<=10;i++){
      System.out.print("  "+ i*i*i);
    }
   }
  //Question 10. Write a program of Table  of  5.
     void  table() {
        int x =5;
        for( int i =1;i<=10; i++)
           System.out.println("5 x "+i+" = "+ 5*i);}


  public static void main ( String [] args) {
      Code05 obj = new  Code05();
      
         int choice = 0;

        while (choice != 11) {
            System.out.println("\n\nChoose Any Number from the menu :: ");
            System.out.println("1.Print MySirG 5 times on the_screen ");
            System.out.println("2.Print the first 10 natural numbers.");
            System.out.println("4.Print the first 10 natural numbers in reverse order.");
            System.out.println("5.Prints ten odd natural numbers.");
            System.out.println("6.Check positive, negative or 0.");
            System.out.println("7. Greatest among three numbers.");
            System.out.println("9. Given No. is three digit or not.");
            System.out.println("10. Check Divisibility by 5 or 7.");
            System.out.println("11. Exit");

            // Read user's choice
            System.out.println("\nEnter your choice : ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    a1.divisibleByFive();
                    break;
                case 2:
                    a1.evenOdd();
                    break;
                case 4:
                    a1.postiveNegative();
                    break;
                case 5:
                    a1.maxOfTwo();
                    break;
                case 6:
                    a1.postiveNegativeZero();
                    break;
                case 7:
                    a1.maxOfThree();
                    break;
                case 9:
                    a1.threeDigitNo();
                    break;
                case 10:
                    a1.divBy5_7();
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            } 
  }
   
}



