import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Array s1 = new Array();
        s1.input();
        s1.display();
        s1.binarySearch(87);
    }
}

class Array {
    int[] arr = new int[10];
    Scanner sc = new Scanner(System.in); // Create a single Scanner object

    // Input method
    public void input() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Data inserted:");
    }

    // Display method
    public void display() {
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Add a newline for readability
    }

    // Binary Search method
    public void binarySearch(int item) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == item) {
                System.out.println("Item " + item + " found at index: " + mid);
                return; // Exit the method after finding the item
            } else if (arr[mid] < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Item " + item + " not found in the array.");
    }
}
