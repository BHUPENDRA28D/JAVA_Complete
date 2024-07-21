import java.util.Scanner;

class Assignment04 {
    
    int x = 14, y = 8, z = 2;

    // Question 1.
    void divisibleByFive() {
        System.out.println(x % 5 != 0 ? " is not divisible by 5" : "is divisible by 5");
    }
 
    // Question 2.
    void evenOdd() {
        System.out.println(x % 2 == 0 ? "Even" : "Odd");
    }

    // Question 4.
    void postiveNegative() {
        System.out.println(x > 0 ? "Positive" : "Non Positive");
    }

    // Question 5.
    void maxOfTwo() {
        System.out.println(x > y ? "x is Greater" : "y is Greater");
    }

    // Question 6.
    void postiveNegativeZero() {
        if (x > 0)
            System.out.println("Positive");
        else if (x < 0)
            System.out.println("Negative");
        else 
            System.out.println("Zero");
    }

    // Question 7.
    void maxOfThree() {
        if (x > y && x > z)
            System.out.println("x is greater than both y and z");
        else if (y > z && y > x)
            System.out.println("y is greater than both x and z");
        else
            System.out.println("z is greater than both x and y");
    }

    // Question 9.
    void threeDigitNo() {
        int temp = x; // Store the original value of x
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        if (count == 3)
            System.out.println(x + " has exactly 3 digits.");
        else
            System.out.println(x + " does not have 3 digits.");
    }

    // Question 10.
    void divBy5_7() {
        if (x % 5 == 0 || x % 7 == 0)
            System.out.println(x + " is divisible by 5 or 7 ");
        else
            System.out.println(x + " is not divisible by 5 or 7 ");
    }

    public static void main(String[] args) {
        Assignment04 a1 = new Assignment04();
        int choice = 0;

        while (choice != 11) {
            System.out.println("\n\nChoose Any Number from the menu :: ");
            System.out.println("1. Check Divisibility by 5.");
            System.out.println("2. Check even odd.");
            System.out.println("4. Check Positive and Nonpositive.");
            System.out.println("5. Greatest between two numbers.");
            System.out.println("6. Check positive, negative or 0.");
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
}
